package com.example.nbcsporsassignmentapp.data

import com.example.nbcsporsassignmentapp.domain.ShelfRepository
import com.example.nbcsporsassignmentapp.domain.models.Shelf
import com.google.gson.Gson
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryShelfRepositoryImpl @Inject constructor(private val gson: Gson) : ShelfRepository {
    override fun getShelves(): List<Shelf> {
        val response = gson.fromJson(shelvesJsonMore, ShelvesResponse::class.java)
        return response?.shelves ?: emptyList()
    }
}