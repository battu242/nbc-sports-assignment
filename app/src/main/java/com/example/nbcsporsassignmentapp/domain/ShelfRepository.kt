package com.example.nbcsporsassignmentapp.domain

import com.example.nbcsporsassignmentapp.domain.models.Shelf

interface ShelfRepository {
    fun getShelves(): List<Shelf>
}