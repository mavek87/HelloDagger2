package com.matteoveroni.hellodagger.di.modules;

import com.matteoveroni.hellodagger.dto.User;
import dagger.Module;
import dagger.Provides;

@Module
public class ModuleUsers {

    @Provides
    public User produceUser() {
        return new User();
    }
}
