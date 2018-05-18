package com.example.han_ttb_ttv.tippin2.views.twofactorauth;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityTwofactorBinding;

/**
 * Created by han-ttb-ttv on 5/18/2018.
 */

public class TwofactorauthActivity extends AppCompatActivity {
    ActivityTwofactorBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_twofactor);
        initiate();
    }

    private void initiate() {
        binding.toolbartwofactor.toolbar.setNavigationIcon(R.drawable.ic_back_white);
        int labelColor=getResources().getColor(R.color.all_colorWhite,null);
        int backgroundColor=getResources().getColor(R.color.all_colorRed,null);
        String label=getResources().getString(R.string.settingTwoFactorAuth_twoStepAuthentication);
        binding.toolbartwofactor.title.setText(label);
        binding.toolbartwofactor.title.setTextColor(labelColor);
        binding.toolbartwofactor.toolbar.setBackgroundColor(backgroundColor);
    }
}
