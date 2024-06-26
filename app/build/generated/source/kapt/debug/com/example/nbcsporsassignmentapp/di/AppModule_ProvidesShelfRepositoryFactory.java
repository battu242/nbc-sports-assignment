// Generated by Dagger (https://dagger.dev).
package com.example.nbcsporsassignmentapp.di;

import com.example.nbcsporsassignmentapp.domain.ShelfRepository;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvidesShelfRepositoryFactory implements Factory<ShelfRepository> {
  private final Provider<Gson> gsonProvider;

  public AppModule_ProvidesShelfRepositoryFactory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public ShelfRepository get() {
    return providesShelfRepository(gsonProvider.get());
  }

  public static AppModule_ProvidesShelfRepositoryFactory create(Provider<Gson> gsonProvider) {
    return new AppModule_ProvidesShelfRepositoryFactory(gsonProvider);
  }

  public static ShelfRepository providesShelfRepository(Gson gson) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesShelfRepository(gson));
  }
}
