package com.erikbuttram.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by erikb on 1/20/16.
 *
 * Trivial Component that provides the interface
 * that Dagger 2 will use to satisfy components needing injection at run time
 * the implementing interface is determined at runtime, however, catching any
 * errors/stupidity you may throw at it.
 */
@Singleton
@Component(modules=TrivialModule.class)
public interface TrivialComponent {
    void inject(MainActivity activity);
}
