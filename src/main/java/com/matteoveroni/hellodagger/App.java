package com.matteoveroni.hellodagger;

import com.google.gson.Gson;
import com.matteoveroni.hellodagger.dto.User;
import javax.inject.Inject;

public class App {

    private final User user;
    private final Gson gson;

    @Inject
    public App(User user, Gson gson) {
        this.user = user;
        this.gson = gson;
    }

    public void start() {
        System.out.println("Ciao");
        System.out.println(gson.toJson(user));
    }
}
