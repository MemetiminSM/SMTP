package com.seleniummaster.classtutorial;

public class User {
    //login
    private String userName;
    private String userPassword;
    // add a new client


    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
}
