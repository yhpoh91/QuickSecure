package com.kopitech.quicksecure.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yeehuipoh on 7/4/17.
 */

@Singleton
@Component(modules = {MainModule.class})
public interface GraphComponent {
    final class Initializer {
        private Initializer(){
        }

        public static GraphComponent init(DaggerApplication application){
            MainModule mainModule = new MainModule(application);
            return DaggerGraphComponent.builder().mainModule(mainModule).build();
        }
    }
}
