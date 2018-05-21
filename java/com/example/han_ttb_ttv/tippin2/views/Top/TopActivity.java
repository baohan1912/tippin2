package com.example.han_ttb_ttv.tippin2.views.Top;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.example.han_ttb_ttv.tippin2.Fragments.IntroduceSliderOne;
import com.example.han_ttb_ttv.tippin2.Fragments.IntroduceSliderThree;
import com.example.han_ttb_ttv.tippin2.Fragments.IntroduceSliderTwo;
import com.example.han_ttb_ttv.tippin2.Fragments.TopScreenViewPaperAdapter;
import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityTopBinding;

public class TopActivity extends AppCompatActivity{
    ActivityTopBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_top);
        initial();
    }

    private void initial() {
        //Pour adapter to ViewPaper
        TopScreenViewPaperAdapter adapter = new TopScreenViewPaperAdapter(getSupportFragmentManager());
        adapter.addFragment(new IntroduceSliderOne());
        adapter.addFragment(new IntroduceSliderTwo());
        adapter.addFragment(new IntroduceSliderThree());
        binding.VPtopSrceen.setAdapter(adapter);
        //Set slide indicator
        setindicator();
    }

    private void setindicator() {
        binding.slideindicator.setupWithViewPager(binding.VPtopSrceen);
        for(int i =0; i < binding.slideindicator.getTabCount();++i){
            View tab = ((ViewGroup)binding.slideindicator.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            int margin = getResources().getDimensionPixelSize(R.dimen.slide_indicator_margin);
            p.setMargins(margin,0,margin,0);
            tab.requestLayout();
        }
    }
}
