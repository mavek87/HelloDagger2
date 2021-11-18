package com.matteoveroni.hellodagger.di.components;

import com.matteoveroni.hellodagger.App;
import com.matteoveroni.hellodagger.di.modules.ModuleSerialization;
import com.matteoveroni.hellodagger.di.modules.ModuleUsers;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                ModuleUsers.class,
                ModuleSerialization.class
        }
)
public interface AppComponent {
    App app();
}
