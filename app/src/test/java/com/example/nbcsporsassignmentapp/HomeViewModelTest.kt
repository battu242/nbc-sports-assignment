package com.example.nbcsporsassignmentapp

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.example.nbcsporsassignmentapp.domain.ShelfRepository
import com.example.nbcsporsassignmentapp.domain.models.Shelf
import com.example.nbcsporsassignmentapp.presentation.home.HomeViewModel
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class HomeViewModelTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var shelfRepository: ShelfRepository

    private lateinit var shelfListObserver: Observer<List<Shelf>>

    @Before
    fun setUp() {
        shelfRepository = mockk(relaxed = true)
        homeViewModel = HomeViewModel(shelfRepository)
        shelfListObserver = mockk(relaxed = true)
        homeViewModel.shelves.observeForever(shelfListObserver)
    }

    @After
    fun tearDown() {

    }

    @Test
    fun `verify get shelf list`() {
        val mockShelves = listOf(
            Shelf("Title 1", "Type 1", emptyList()),
            Shelf("Title 2", "Type 2", emptyList())
        )

        every { shelfRepository.getShelves() } returns mockShelves

        homeViewModel.getShelves()

        assert(homeViewModel.shelves.value == mockShelves)
        verify(exactly = 1) { shelfListObserver.onChanged(mockShelves) }
    }
}