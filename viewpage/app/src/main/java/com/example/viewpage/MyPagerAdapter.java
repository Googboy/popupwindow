package com.example.viewpage;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by 潘硕 on 2017/11/16.
 */

public class MyPagerAdapter extends PagerAdapter {
    private ArrayList<View> viewlists;

    public MyPagerAdapter(){

    }
    public MyPagerAdapter(ArrayList<View> viewlists){
        super();
        this.viewlists = viewlists;
    }
    @Override
    public int getCount() {
        return viewlists.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container,int position){
        container.addView(viewlists.get(position));
        return viewlists.get(position);
    }

    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView(viewlists.get(position));
    }
}
