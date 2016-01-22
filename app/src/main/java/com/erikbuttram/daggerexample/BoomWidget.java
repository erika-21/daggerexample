package com.erikbuttram.daggerexample;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by erikb on 1/20/16.
 *
 * Dumbest Widget on the planet, it literally provides
 * a random string.  Granted this isn't the most
 * production worthy example, but it should demonstrate
 * that Components can be instantiated by request via the
 * Provider<T> Object
 */
public class BoomWidget {

    private ArrayList<String> mBooms;

    public BoomWidget() {
        mBooms = new ArrayList<>();
        mBooms.add("Boom!");
        mBooms.add("POW!");
        mBooms.add("Wham!");
        mBooms.add("High Fives!");
    }



}
