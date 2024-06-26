package com.example.nbcsporsassignmentapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.filters.MediumTest
import com.example.nbcsporsassignmentapp.domain.models.Shelf
import com.example.nbcsporsassignmentapp.domain.models.ShelfItem
import com.example.nbcsporsassignmentapp.presentation.home.HomeFragment
import com.example.nbcsporsassignmentapp.presentation.home.HomeFragmentFactory
import com.example.nbcsporsassignmentapp.presentation.home.HomeShelfListAdapter
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@MediumTest
@HiltAndroidTest
class HomeFragmentTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Inject
    lateinit var fragmentFactory: HomeFragmentFactory

    @Before
    fun setUp() {
        hiltRule.inject()
    }

    @Test
    fun testRecyclerViewDisplaysData() {
        val shelves =
            listOf(
                Shelf(
                    title = "Continue Watching",
                    type = "Shelf",
                    shelfItems = listOf(
                        ShelfItem(
                            type = "Live",
                            tagline = "WATCH NBC NEWS NOW LIVE",
                            title = "Hallie Jackson NOW",
                            subtitle = "Live News Streaming",
                            image = "https://img.nbc.com/sites/nbcunbc/files/images/2021/2/04/NBC-News_2048_1152.jpg",
                            labelBadge = null
                        ),
                        ShelfItem(
                            type = "Episode",
                            tagline = null,
                            title = "NBC Nightly News with Lester Holt",
                            subtitle = "S2022 E101 04/12/22",
                            image = "https://img.nbc.com/sites/nbcunbc/files/images/2021/2/04/NBC-News_2048_1152.jpg",
                            labelBadge = "EXPIRING"
                        ),
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
        launchFragmentInHiltContainer<HomeFragment>(
            factory = fragmentFactory
        ) {
            viewModel.setShelvesData(shelves)
        }

        onView(withId(R.id.rvShelfList)).check(matches(isDisplayed()))
        onView(withId(R.id.rvShelfList)).check { view, _ ->
            val recyclerView = view as RecyclerView
            val adapter = recyclerView.adapter as HomeShelfListAdapter
            assertEquals(1, adapter.itemCount)
        }
    }
}