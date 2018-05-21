package com.example.han_ttb_ttv.tippin2.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by han-ttb-ttv on 5/14/2018.
 */

public class TopScreenViewPaperAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;
    public TopScreenViewPaperAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new ArrayList<>();
    }




    public void addFragment(Fragment frg){
        this.fragments.add(frg);
    }
    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

}
