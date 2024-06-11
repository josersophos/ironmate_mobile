package com.sophos.app.hooks;

import com.sophos.app.models.UserLoginModel;

import java.util.Map;

public class ConfiguratorUser {
    public UserLoginModel convertToUserLogin(Map<String, String> entry) {
        return new UserLoginModel(
                entry.get("username"),
                entry.get("password"));
    }
}