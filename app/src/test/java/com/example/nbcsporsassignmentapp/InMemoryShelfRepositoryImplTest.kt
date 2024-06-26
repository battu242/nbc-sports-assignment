package com.example.nbcsporsassignmentapp

import com.example.nbcsporsassignmentapp.data.InMemoryShelfRepositoryImpl
import com.example.nbcsporsassignmentapp.data.ShelvesResponse
import com.example.nbcsporsassignmentapp.domain.models.Shelf
import com.example.nbcsporsassignmentapp.domain.models.ShelfItem
import com.google.gson.Gson
import io.mockk.every
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

class InMemoryShelfRepositoryImplTest {
    private lateinit var mockGson: Gson

    private lateinit var repository: InMemoryShelfRepositoryImpl

    @Before
    fun setup() {
        mockGson = mockk()
        repository = InMemoryShelfRepositoryImpl(mockGson)
    }

    @Test
    fun testGetShelvesContainsLiveType() {
        // Mock Gson response
        val shelvesResponse = ShelvesResponse(
            page = "HOMEPAGE",
            shelves = listOf(
                Shelf(
                    title = "Continue Watching",
                    type = "Shelf",
                    listOf(
                        ShelfItem(
                            type = "Live",
                            tagline = "WATCH NBC NEWS NOW LIVE",
                            title = "Hallie Jackson NOW",
                            subtitle = "Live News Streaming",
                            image = "https://img.nbc.com/sites/nbcunbc/files/images/2021/2/04/NBC-News_2048_1152.jpg",
                            labelBadge = null
                        )
                    )
                )
            )
        )

        every {
            mockGson.fromJson(
                any<String>(),
                ShelvesResponse::class.java
            )
        } returns shelvesResponse

        val result = repository.getShelves()

        assertEquals(1, result.size)
        assertEquals("Continue Watching", result[0].title)
        assertEquals(1, result[0].shelfItems.size)
        assertEquals(
            "Hallie Jackson NOW",
            result[0].shelfItems[0].title
        )
        assertEquals(
            "Live",
            result[0].shelfItems[0].type
        )
    }

    @Test
    fun testGetShelvesContainsEpisodeType() {
        // Mock Gson response
        val shelvesResponse = ShelvesResponse(
            page = "HOMEPAGE",
            shelves = listOf(
                Shelf(
                    title = "Continue Watching",
                    type = "Shelf",
                    listOf(
                        ShelfItem(
                            type = "Episode",
                            tagline = null,
                            title = "NBC Nightly News with Lester Holt",
                            subtitle = "S2022 E101 04/12/22",
                            image = "https://img.nbc.com/sites/nbcunbc/files/images/2021/2/04/NBC-News_2048_1152.jpg",
                            labelBadge = "EXPIRING"
                        )
                    )
                )
            )
        )

        every {
            mockGson.fromJson(
                any<String>(),
                ShelvesResponse::class.java
            )
        } returns shelvesResponse

        val result = repository.getShelves()

        assertEquals(1, result.size)
        assertEquals("Continue Watching", result[0].title)
        assertEquals(1, result[0].shelfItems.size)
        assertEquals(
            "NBC Nightly News with Lester Holt",
            result[0].shelfItems[0].title
        )
        assertEquals(
            "Episode",
            result[0].shelfItems[0].type
        )
        assertEquals(
            "EXPIRING",
            result[0].shelfItems[0].labelBadge
        )
    }

    @Test
    fun testGetShelvesContainsShowType() {
        // Mock Gson response
        val shelvesResponse = ShelvesResponse(
            page = "HOMEPAGE",
            shelves = listOf(
                Shelf(
                    title = "Continue Watching",
                    type = "Shelf",
                    listOf(
                        ShelfItem(
                            type = "Show",
                            title = "The Thing About Pam",
                            image = "https://img.nbc.com/sites/nbcunbc/files/images/2021/2/04/NBC-News_2048_1152.jpg",
                            tagline = null,
                            subtitle = null,
                            labelBadge = null
                        )
                    )
                )
            )
        )

        every {
            mockGson.fromJson(
                any<String>(),
                ShelvesResponse::class.java
            )
        } returns shelvesResponse

        val result = repository.getShelves()

        assertEquals(1, result.size)
        assertEquals("Continue Watching", result[0].title)
        assertEquals(1, result[0].shelfItems.size)
        assertEquals(
            "The Thing About Pam",
            result[0].shelfItems[0].title
        )
        assertEquals(
            "Show",
            result[0].shelfItems[0].type
        )
        assertEquals(
            null,
            result[0].shelfItems[0].subtitle
        )
        assertEquals(
            null,
            result[0].shelfItems[0].labelBadge
        )
        assertEquals(
            null,
            result[0].shelfItems[0].tagline
        )
    }
}