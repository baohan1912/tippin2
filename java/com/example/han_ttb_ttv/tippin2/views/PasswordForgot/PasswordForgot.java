package com.example.han_ttb_ttv.tippin2.views.PasswordForgot;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityPasswordforgotBinding;

/**
 * Created by han-ttb-ttv on 5/17/2018.
 */

public class PasswordForgot extends AppCompatActivity {
    ActivityPasswordforgotBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_passwordforgot);
        initiate();
    }

    private void initiate() {
        binding.toolbarPWforgot.toolbar.setNavigationIcon(R.drawable.ic_back_red);
        int labelColor=getResources().getColor(R.color.all_colorRed,null);
        int backgroundColor=getResources().getColor(R.color.all_colorWhite,null);
        String label=getResources().getString(R.string.forgotpassword);
        binding.toolbarPWforgot.title.setText(label);
        binding.toolbarPWforgot.title.setTextColor(labelColor);
        binding.toolbarPWforgot.toolbar.setBackgroundColor(backgroundColor);
    }
}
