package com.example.han_ttb_ttv.tippin2.views.Register;

import com.example.han_ttb_ttv.tippin2.Models.User;

import java.util.Observable;

/**
 * Created by han-ttb-ttv on 5/16/2018.
 */

public class RegisterViewModel extends Observable {
    public User user;
    public String passConfirm;
    public String titlebar;
    public RegisterViewModel(User user, String passConfirm) {
        this.user = user;
        this.passConfirm = passConfirm;
    }

    public void confirmPassword(){
        if(this.user.getPassword().equals(passConfirm)){

        }
    }
}
