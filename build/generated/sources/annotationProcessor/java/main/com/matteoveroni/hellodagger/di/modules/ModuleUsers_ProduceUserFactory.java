package com.matteoveroni.hellodagger.di.modules;

import com.matteoveroni.hellodagger.dto.User;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ModuleUsers_ProduceUserFactory implements Factory<User> {
  private final ModuleUsers module;

  public ModuleUsers_ProduceUserFactory(ModuleUsers module) {
    this.module = module;
  }

  @Override
  public User get() {
    return produceUser(module);
  }

  public static ModuleUsers_ProduceUserFactory create(ModuleUsers module) {
    return new ModuleUsers_ProduceUserFactory(module);
  }

  public static User produceUser(ModuleUsers instance) {
    return Preconditions.checkNotNullFromProvides(instance.produceUser());
  }
}
