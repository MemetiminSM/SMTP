package com.seleniummaster.tutorial;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMapProjectWeek15 {
    public static void main(String[] args){

//Store a website name and address
        Map<String, String> states = new HashMap<>();
        //use put method to add data to object
        states.put("MD", "Maryland");
        states.put("VA", "Virginia");
        states.put("NY", "New York");
        System.out.println("Count the number of keys and print out the number" + states.size());

            //print out each key and value in the object map

        Set<String>stateKeys=states.keySet();
        stateKeys = states.keySet();

        for (String state : stateKeys) {

String value=states.get(state);
            System.out.println(String.format("state:%s", states));

        }
    }

}
