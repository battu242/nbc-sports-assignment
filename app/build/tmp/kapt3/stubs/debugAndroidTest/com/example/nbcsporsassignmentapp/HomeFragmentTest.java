package com.example.nbcsporsassignmentapp;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.recyclerview.widget.RecyclerView;
import androidx.test.filters.MediumTest;
import com.example.nbcsporsassignmentapp.domain.models.Shelf;
import com.example.nbcsporsassignmentapp.domain.models.ShelfItem;
import com.example.nbcsporsassignmentapp.presentation.home.HomeFragment;
import com.example.nbcsporsassignmentapp.presentation.home.HomeFragmentFactory;
import com.example.nbcsporsassignmentapp.presentation.home.HomeShelfListAdapter;
import dagger.hilt.android.testing.HiltAndroidRule;
import dagger.hilt.android.testing.HiltAndroidTest;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import javax.inject.Inject;

@androidx.test.filters.MediumTest
@dagger.hilt.android.testing.HiltAndroidTest
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0016H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0018"}, d2 = {"Lcom/example/nbcsporsassignmentapp/HomeFragmentTest;", "", "()V", "fragmentFactory", "Lcom/example/nbcsporsassignmentapp/presentation/home/HomeFragmentFactory;", "getFragmentFactory", "()Lcom/example/nbcsporsassignmentapp/presentation/home/HomeFragmentFactory;", "setFragmentFactory", "(Lcom/example/nbcsporsassignmentapp/presentation/home/HomeFragmentFactory;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "instantTaskExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getInstantTaskExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "setInstantTaskExecutorRule", "(Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;)V", "setUp", "", "testRecyclerViewDisplaysData", "app_debugAndroidTest"})
public final class HomeFragmentTest {
    @org.jetbrains.annotations.NotNull
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull
    private androidx.arch.core.executor.testing.InstantTaskExecutorRule instantTaskExecutorRule;
    @javax.inject.Inject
    public com.example.nbcsporsassignmentapp.presentation.home.HomeFragmentFactory fragmentFactory;
    
    public HomeFragmentTest() {
        super();
    }
    
    @org.junit.Rule
    @org.jetbrains.annotations.NotNull
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.junit.Rule
    @org.jetbrains.annotations.NotNull
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getInstantTaskExecutorRule() {
        return null;
    }
    
    public final void setInstantTaskExecutorRule(@org.jetbrains.annotations.NotNull
    androidx.arch.core.executor.testing.InstantTaskExecutorRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.nbcsporsassignmentapp.presentation.home.HomeFragmentFactory getFragmentFactory() {
        return null;
    }
    
    public final void setFragmentFactory(@org.jetbrains.annotations.NotNull
    com.example.nbcsporsassignmentapp.presentation.home.HomeFragmentFactory p0) {
    }
    
    @org.junit.Before
    public final void setUp() {
    }
    
    @org.junit.Test
    public final void testRecyclerViewDisplaysData() {
    }
}