package com.example.nbcsporsassignmentapp.data

import com.example.nbcsporsassignmentapp.domain.models.Shelf

data class ShelvesResponse(
    val page: String,
    val shelves: List<Shelf>
)
