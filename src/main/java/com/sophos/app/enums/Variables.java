package com.sophos.app.enums;

public enum Variables {
    PLATFORM_NAME("Android");

     private final String value;

    Variables(String value){
        this.value = value;
    }
    public String value(){
        return value;
    }
}
