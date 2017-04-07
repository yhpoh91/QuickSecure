package com.kopitech.quicksecure.dagger;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yeehuipoh on 7/4/17.
 */

@Module
public class MainModule {
    private DaggerApplication application;

    public MainModule(DaggerApplication application){
        this.application = application;
    }

    @Provides
    protected Application provideApplication(){
        return this.application;
    }

    @Provides
    public Context provideContext(){
        return this.application.getApplicationContext();
    }


}
