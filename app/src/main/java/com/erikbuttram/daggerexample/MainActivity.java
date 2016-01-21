package com.erikbuttram.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainActivity extends AppCompatActivity {

    @Inject
    Provider<BoomWidget> mBoomProvider;

    @Inject DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleApplication.component(getApplicationContext())
                .inject(this);

    }
}
