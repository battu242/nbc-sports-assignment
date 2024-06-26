package com.example.nbcsporsassignmentapp.presentation.home;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.nbcsporsassignmentapp.domain.ShelfRepository;
import com.example.nbcsporsassignmentapp.domain.models.Shelf;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/nbcsporsassignmentapp/presentation/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "shelfRepository", "Lcom/example/nbcsporsassignmentapp/domain/ShelfRepository;", "(Lcom/example/nbcsporsassignmentapp/domain/ShelfRepository;)V", "_shelves", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/nbcsporsassignmentapp/domain/models/Shelf;", "shelves", "Landroidx/lifecycle/LiveData;", "getShelves", "()Landroidx/lifecycle/LiveData;", "", "setShelvesData", "data", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.nbcsporsassignmentapp.domain.ShelfRepository shelfRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.nbcsporsassignmentapp.domain.models.Shelf>> _shelves = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.nbcsporsassignmentapp.domain.models.Shelf>> shelves = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.example.nbcsporsassignmentapp.domain.ShelfRepository shelfRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.nbcsporsassignmentapp.domain.models.Shelf>> getShelves() {
        return null;
    }
    
    public final void getShelves() {
    }
    
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    public final void setShelvesData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.nbcsporsassignmentapp.domain.models.Shelf> data) {
    }
}