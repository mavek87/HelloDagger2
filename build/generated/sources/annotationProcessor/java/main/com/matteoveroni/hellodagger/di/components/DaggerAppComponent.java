package com.matteoveroni.hellodagger.di.components;

import com.matteoveroni.hellodagger.App;
import com.matteoveroni.hellodagger.di.modules.ModuleSerialization;
import com.matteoveroni.hellodagger.di.modules.ModuleSerialization_ProduceGsonFactory;
import com.matteoveroni.hellodagger.di.modules.ModuleUsers;
import com.matteoveroni.hellodagger.di.modules.ModuleUsers_ProduceUserFactory;
import dagger.internal.DaggerGenerated;
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
public final class DaggerAppComponent implements AppComponent {
  private final ModuleUsers moduleUsers;

  private final ModuleSerialization moduleSerialization;

  private final DaggerAppComponent appComponent = this;

  private DaggerAppComponent(ModuleUsers moduleUsersParam,
      ModuleSerialization moduleSerializationParam) {
    this.moduleUsers = moduleUsersParam;
    this.moduleSerialization = moduleSerializationParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @Override
  public App app() {
    return new App(ModuleUsers_ProduceUserFactory.produceUser(moduleUsers), ModuleSerialization_ProduceGsonFactory.produceGson(moduleSerialization));
  }

  public static final class Builder {
    private ModuleUsers moduleUsers;

    private ModuleSerialization moduleSerialization;

    private Builder() {
    }

    public Builder moduleUsers(ModuleUsers moduleUsers) {
      this.moduleUsers = Preconditions.checkNotNull(moduleUsers);
      return this;
    }

    public Builder moduleSerialization(ModuleSerialization moduleSerialization) {
      this.moduleSerialization = Preconditions.checkNotNull(moduleSerialization);
      return this;
    }

    public AppComponent build() {
      if (moduleUsers == null) {
        this.moduleUsers = new ModuleUsers();
      }
      if (moduleSerialization == null) {
        this.moduleSerialization = new ModuleSerialization();
      }
      return new DaggerAppComponent(moduleUsers, moduleSerialization);
    }
  }
}
