package com.seleniummaster.tutorial;

public class User5 {
    private  String userName;
    private  String userPassword;
    private String userRole;

    public User5() {
    }

    public User5(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User5(String userName, String userPassword, String userRole) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
