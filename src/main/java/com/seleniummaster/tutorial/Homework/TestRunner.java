package com.seleniummaster.tutorial.Homework;

import com.seleniummaster.tutorial.FunctionLibrary;


public class TestRunner {

    public static void main(String[] args) throws InterruptedException {
        //define a function library instance
        FunctionLibrary functionLibrary=new FunctionLibrary();
        //open the browser and the site
        //calling open browser action
        functionLibrary.openTestWebsite("http://sandbox.clinicwise.net");
        //calling login action
       LoginUser user=new LoginUser("admin", "test");
       functionLibrary.login(user.getUsername(),user.getPassword());
        Client client=new Client("Nadal"+System.currentTimeMillis(), "Byran"+System.currentTimeMillis(),
                "Male", "VIP", "01/01/1990",
                "12344456", "",
                "0432121321", "jiang@gmail.com", "1234 oak road", "baltimore",
                "21020", "", "manager", "This is a test client");
        //call add New Client
        functionLibrary.addNewClient(client);
        //call verfication
       functionLibrary.verifyClient();
        //logout
       functionLibrary.logout();
        //close the browser
        functionLibrary.closeBrowser();

    }
}