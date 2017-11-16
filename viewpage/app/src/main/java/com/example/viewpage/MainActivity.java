package com.example.viewpage;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ArrayList<View> aList;
    private MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        aList = new ArrayList<View>();
        LayoutInflater layoutInflater = getLayoutInflater();
        aList.add(layoutInflater.inflate(R.layout.view_one,null,false));
        aList.add(layoutInflater.inflate(R.layout.view_two,null,false));
        aList.add(layoutInflater.inflate(R.layout.view_three,null,false));
        mAdapter = new MyPagerAdapter(aList);
        viewPager.setAdapter(mAdapter);
    }
}
