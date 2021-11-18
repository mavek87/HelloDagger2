package com.matteoveroni.hellodagger.di.modules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;

@Module
public class ModuleSerialization {

    @Provides
    public Gson produceGson() {
        return new GsonBuilder().setPrettyPrinting().create();
    }
}
