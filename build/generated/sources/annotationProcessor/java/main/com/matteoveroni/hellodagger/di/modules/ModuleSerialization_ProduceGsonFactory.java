package com.matteoveroni.hellodagger.di.modules;

import com.google.gson.Gson;
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
public final class ModuleSerialization_ProduceGsonFactory implements Factory<Gson> {
  private final ModuleSerialization module;

  public ModuleSerialization_ProduceGsonFactory(ModuleSerialization module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return produceGson(module);
  }

  public static ModuleSerialization_ProduceGsonFactory create(ModuleSerialization module) {
    return new ModuleSerialization_ProduceGsonFactory(module);
  }

  public static Gson produceGson(ModuleSerialization instance) {
    return Preconditions.checkNotNullFromProvides(instance.produceGson());
  }
}
