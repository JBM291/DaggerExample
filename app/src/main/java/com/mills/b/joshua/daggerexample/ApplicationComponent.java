package com.mills.b.joshua.daggerexample;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Inferno on 2/27/2018.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MainActivity target);
}
