package com.example.nbcsporsassignmentapp.data;

import com.example.nbcsporsassignmentapp.domain.ShelfRepository;
import com.example.nbcsporsassignmentapp.domain.models.Shelf;
import com.google.gson.Gson;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/nbcsporsassignmentapp/data/InMemoryShelfRepositoryImpl;", "Lcom/example/nbcsporsassignmentapp/domain/ShelfRepository;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getShelves", "", "Lcom/example/nbcsporsassignmentapp/domain/models/Shelf;", "app_debug"})
public final class InMemoryShelfRepositoryImpl implements com.example.nbcsporsassignmentapp.domain.ShelfRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject
    public InMemoryShelfRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.gson.Gson gson) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.example.nbcsporsassignmentapp.domain.models.Shelf> getShelves() {
        return null;
    }
}