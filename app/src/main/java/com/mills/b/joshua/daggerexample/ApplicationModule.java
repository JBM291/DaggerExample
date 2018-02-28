package com.mills.b.joshua.daggerexample;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Inferno on 2/27/2018.
 */
@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
