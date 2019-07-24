package com.seleniummaster.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
//define a map(construct a map)

//Store a website name and address
        Map<String, String> sites = new HashMap<>();
        //use put method to add data to object
        sites.put("yahoo", "wwww.yahoo.com");
        sites.put("google", "www.google.com");
        sites.put("youtube", "www.youtube.com");
        System.out.println("Total sites in the map" + sites.size());
//containskey is used for verifiying key
        if (sites.containsKey("yahoo"))
            System.out.println("Yahoo url is "+sites.get("yahoo"));
        //use remove to remove a key
        sites.remove("google");
        // use replace to replace key value
        sites.put("selenium","www.selenium.com");
        sites.replace("selenium","www.selenium.com","seleniummastertest.com");
        Set<String> sitekeys = null;
        if (sites.containsKey("yahoo"))

            //print out each key and value in the object map
            sitekeys = sites.keySet();
        for (String site : sitekeys) {

            String url = sites.get(site);
            System.out.println(String.format("site url:%s", url));


        }
    }
}
