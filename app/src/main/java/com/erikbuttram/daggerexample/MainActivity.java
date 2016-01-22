package com.erikbuttram.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.erikbuttram.daggerexample.model.SomeData;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainActivity extends AppCompatActivity {

    @Inject
    Provider<BoomWidget> mBoomProvider;

    @Inject DataPresenter mPresenter;

    private ViewGroup mBoomGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleApplication.component(getApplicationContext())
                .inject(this);

        mBoomGroup = (ViewGroup) findViewById(R.id.boom_container);
        ViewGroup dataContainer = (ViewGroup)findViewById(R.id.data_container);
        View button = findViewById(R.id.boom_btn);
        button.setOnClickListener(mOnClick);
        dataContainer.addView(mPresenter.present(this));
    }

    private View.OnClickListener mOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            BoomWidget bw = mBoomProvider.get();
            mBoomGroup.addView(bw);
        }
    };
}
