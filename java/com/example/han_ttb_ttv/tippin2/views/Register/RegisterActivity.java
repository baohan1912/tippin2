package com.example.han_ttb_ttv.tippin2.views.Register;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityRegisterBinding;

/**
 * Created by han-ttb-ttv on 5/16/2018.
 */

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_register);
        initiate();

    }

    private void initiate() {
        binding.toolbarRegister.toolbar.setNavigationIcon(R.drawable.ic_back_red);
        int labelColor=getResources().getColor(R.color.all_colorRed,null);
        int backgroundColor=getResources().getColor(R.color.all_colorWhite,null);
        String label=getResources().getString(R.string.register);
        binding.toolbarRegister.title.setText(label);
        binding.toolbarRegister.title.setTextColor(labelColor);
        binding.toolbarRegister.toolbar.setBackgroundColor(backgroundColor);
    }
}
