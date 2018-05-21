package com.example.han_ttb_ttv.tippin2.views.Login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityLoginBinding;

/**
 * Created by han-ttb-ttv on 5/16/2018.
 */

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        initiate();
    }

    private void initiate() {
        binding.toolbarLogin.toolbar.setNavigationIcon(R.drawable.ic_back_white);
        int labelColor=getResources().getColor(R.color.all_colorWhite,null);
        int backgroundColor=getResources().getColor(R.color.all_colorRed,null);
        String label=getResources().getString(R.string.login);
        binding.toolbarLogin.title.setText(label);
        binding.toolbarLogin.title.setTextColor(labelColor);
        binding.toolbarLogin.toolbar.setBackgroundColor(backgroundColor);
    }
}
