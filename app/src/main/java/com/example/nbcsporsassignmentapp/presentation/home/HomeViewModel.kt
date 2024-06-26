package com.example.nbcsporsassignmentapp.presentation.home

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nbcsporsassignmentapp.domain.ShelfRepository
import com.example.nbcsporsassignmentapp.domain.models.Shelf
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val shelfRepository: ShelfRepository
) : ViewModel() {

    private val _shelves = MutableLiveData<List<Shelf>>()
    val shelves: LiveData<List<Shelf>> = _shelves

    init {
        getShelves()
    }

    fun getShelves() {
        _shelves.value = shelfRepository.getShelves()
    }

    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun setShelvesData(data: List<Shelf>) {
        _shelves.value = data
    }
}