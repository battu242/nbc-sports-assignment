package com.example.nbcsporsassignmentapp.domain.models

import com.google.gson.annotations.SerializedName

data class Shelf(
    val title: String,
    val type: String,
    @SerializedName("items")
    val shelfItems: List<ShelfItem>
)
