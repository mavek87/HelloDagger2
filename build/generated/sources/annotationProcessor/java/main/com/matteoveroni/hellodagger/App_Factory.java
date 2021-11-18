package com.matteoveroni.hellodagger;

import com.google.gson.Gson;
import com.matteoveroni.hellodagger.dto.User;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class App_Factory implements Factory<App> {
  private final Provider<User> userProvider;

  private final Provider<Gson> gsonProvider;

  public App_Factory(Provider<User> userProvider, Provider<Gson> gsonProvider) {
    this.userProvider = userProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public App get() {
    return newInstance(userProvider.get(), gsonProvider.get());
  }

  public static App_Factory create(Provider<User> userProvider, Provider<Gson> gsonProvider) {
    return new App_Factory(userProvider, gsonProvider);
  }

  public static App newInstance(User user, Gson gson) {
    return new App(user, gson);
  }
}
