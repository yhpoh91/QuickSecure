package com.kopitech.quicksecure.dagger;

import android.app.Application;

/**
 * Created by yeehuipoh on 7/4/17.
 */

public class DaggerApplication extends Application {
    private static final String TAG = "DApp";
    private static DaggerApplication instance;
    private static GraphComponent graph;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        buildComponentGraph();
    }

    public static GraphComponent component(){
        return graph;
    }

    public static void buildComponentGraph(){
        graph = GraphComponent.Initializer.init(instance);
    }
}
