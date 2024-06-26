package com.example.nbcsporsassignmentapp.di;

import com.example.nbcsporsassignmentapp.data.InMemoryShelfRepositoryImpl;
import com.example.nbcsporsassignmentapp.domain.ShelfRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/nbcsporsassignmentapp/di/AppModule;", "", "()V", "providesGson", "Lcom/google/gson/Gson;", "providesShelfRepository", "Lcom/example/nbcsporsassignmentapp/domain/ShelfRepository;", "gson", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.nbcsporsassignmentapp.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson providesGson() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.nbcsporsassignmentapp.domain.ShelfRepository providesShelfRepository(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        return null;
    }
}