package com.matteoveroni.hellodagger;

import com.matteoveroni.hellodagger.di.components.DaggerAppComponent;

public class EntryPoint {

    public static void main(String[] args) {
        System.out.println("Hi");

        App app = DaggerAppComponent
                .builder()
                .build()
                .app();

        app.start();
    }
}
