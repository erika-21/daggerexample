package com.erikbuttram.daggerexample;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by erikb on 1/20/16.
 */
@Module
public class TrivialModule {

    private Context mContext;

    public TrivialModule(Context context) {
        this.mContext = context;
    }

    @Provides
    DataPresenter providePresenter(DataSource dataSource) {
        return new DataPresenter(dataSource);
    }

    @Provides
    BoomWidget provideWidget() {
        return new BoomWidget();
    }

}
