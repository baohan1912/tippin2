package com.example.han_ttb_ttv.tippin2.views.PhoneVerification;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.han_ttb_ttv.tippin2.R;
import com.example.han_ttb_ttv.tippin2.databinding.ActivityPhoneverifyBinding;

/**
 * Created by han-ttb-ttv on 5/16/2018.
 */

public class PhoneVerifyActivity extends AppCompatActivity {
    ActivityPhoneverifyBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_phoneverify);
        initiate();
    }

    private void initiate() {
        binding.toolbarPhoneVerify.toolbar.setNavigationIcon(R.drawable.ic_back_red);
        int labelColor=getResources().getColor(R.color.all_colorRed,null);
        int backgroundColor=getResources().getColor(R.color.all_colorWhite,null);
        String label=getResources().getString(R.string.phoneverification);
        binding.toolbarPhoneVerify.title.setText(label);
        binding.toolbarPhoneVerify.title.setTextColor(labelColor);
        binding.toolbarPhoneVerify.toolbar.setBackgroundColor(backgroundColor);
        binding.toolbarPhoneVerify.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PhoneVerifyActivity.this, "bla", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
