package com.example.nbcsporsassignmentapp.domain.models

data class ShelfItem(
    val type: String,
    val tagline: String?,
    val title: String,
    val subtitle: String?,
    val image: String,
    val labelBadge: String?
)
