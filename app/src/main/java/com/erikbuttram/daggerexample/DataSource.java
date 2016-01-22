package com.erikbuttram.daggerexample;

import com.erikbuttram.daggerexample.model.SomeData;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by erikb on 1/20/16.
 *
 * A trivial data source class that does very little, Not very useful,
 * but shows how a component that can be instantiated implicitly with no effort
 * from the developer
 *
 */
@Singleton
public class DataSource {

    @Inject
    public DataSource() {

    }

    public ArrayList<SomeData> getData() {
        ArrayList<SomeData> dataSet = new ArrayList<>();
        SomeData d1 = new SomeData("name1", "value1");
        SomeData d2 = new SomeData("name2", "value2");
        SomeData d3 = new SomeData("name3", "value3");
        ///and so on
        dataSet.add(d1);
        dataSet.add(d2);
        dataSet.add(d3);
        return dataSet;
    }
}
