package com.bairon.curso.springboot.springbootweb.model.dto;

import com.bairon.curso.springboot.springbootweb.model.UserModel;

public class UserDtoModel {

    private String title;
    private UserModel userModel;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public UserModel getUserModel() {
        return userModel;
    }
    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
   

    
    
}