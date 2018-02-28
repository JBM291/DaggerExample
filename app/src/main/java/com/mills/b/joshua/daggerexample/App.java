package com.mills.b.joshua.daggerexample;

import android.app.Application;

/**
 * Created by Inferno on 2/27/2018.
 */

public class App extends Application{

    private ApplicationComponent component;

    @Override
    public  void onCreate(){
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}
