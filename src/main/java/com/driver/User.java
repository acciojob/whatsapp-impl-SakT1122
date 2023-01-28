package com.driver;

public class User {
    private String name;
    private String mobile;


    public User(){

    }
    public User(String Name,String Mobile){
        this.name=Name;
        this.mobile=Mobile;
    }

    public String getName() {
        return name;
    }
}
