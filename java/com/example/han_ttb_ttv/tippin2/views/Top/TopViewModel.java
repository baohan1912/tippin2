package com.example.han_ttb_ttv.tippin2.views.Top;

import com.example.han_ttb_ttv.tippin2.Fragments.TopScreenViewPaperAdapter;

import java.util.Observable;

/**
 * Created by han-ttb-ttv on 5/17/2018.
 */

public class TopViewModel extends Observable {
    //Pour adapter to ViewPaper
    public TopScreenViewPaperAdapter adapter;


    public TopViewModel(TopScreenViewPaperAdapter adapter) {
        this.adapter = adapter;
    }
}
