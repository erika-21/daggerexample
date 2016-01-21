package com.erikbuttram.daggerexample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by erikb on 1/20/16.
 *
 * Dumbest Widget on the planet, it literally provides
 * a textview with the word "pow" set as the initial text
 */
public class BoomWidget extends TextView {

    private Context mContext;

    private void init() {
        setText("POW!");
    }

    public BoomWidget(Context context) {
        super(context);
    }

    public BoomWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BoomWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BoomWidget(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
