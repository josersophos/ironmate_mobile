package com.sophos.app.models;

import lombok.Data;

@Data
public class UserLoginModel {
    private String username;
    private String password;

    public UserLoginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }
}