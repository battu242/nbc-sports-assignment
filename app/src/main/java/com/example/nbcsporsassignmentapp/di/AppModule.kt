package com.example.nbcsporsassignmentapp.di

import com.example.nbcsporsassignmentapp.data.InMemoryShelfRepositoryImpl
import com.example.nbcsporsassignmentapp.domain.ShelfRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesGson(): Gson {
        return GsonBuilder().create()
    }

    @Singleton
    @Provides
    fun providesShelfRepository(gson: Gson): ShelfRepository {
        return InMemoryShelfRepositoryImpl(gson)
    }
}