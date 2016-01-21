package com.erikbuttram.daggerexample;

import android.app.Application;
import android.content.Context;

/**
 * Created by erikb on 1/20/16.
 */
public class ExampleApplication extends Application {

    private TrivialComponent component;

    public static TrivialComponent component(Context context) {
        ExampleApplication ea = (ExampleApplication)context.getApplicationContext();
        return ea.component;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerTrivialComponent.builder()
                .trivialModule(new TrivialModule(this))
                .build();
    }

}
