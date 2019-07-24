package com.seleniummaster.classtutorial;

import java.util.ArrayList;

public class CommericialRealEstate extends RealEstate {
    private String businessType;
    private  String businessSize;

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessSize() {
        return businessSize;
    }

    public void setBusinessSize(String businessSize) {
        this.businessSize = businessSize;
    }

    public static void main(String[] args){
//one property company
       CommericialRealEstate  brialianProperty=new CommericialRealEstate();
       brialianProperty.setPrice(1000);
       brialianProperty.setLocationCity("Toronto");
       brialianProperty.setLocationState("DownTown");
       brialianProperty.setSize(75);
       brialianProperty.setType("business");
       brialianProperty.setBusinessType("private");
       brialianProperty.setBusinessType("small");

       // another property company
CommericialRealEstate TorontoRealEstate=new CommericialRealEstate();
TorontoRealEstate.setBusinessType("public");
TorontoRealEstate.setBusinessSize("large");
TorontoRealEstate.setType("business");
TorontoRealEstate.setLocationState("school area");
TorontoRealEstate.setPrice(1500);
TorontoRealEstate.setSize(80);
//print array list
        ArrayList<CommericialRealEstate>  propertyCompany=new ArrayList<>();
        propertyCompany.add(brialianProperty);
        propertyCompany.add(TorontoRealEstate);
        for (CommericialRealEstate eachProperty:propertyCompany){

            System.out.println(eachProperty.getBusinessSize()+" "+eachProperty.getLocationCity()+" "+eachProperty.getType());
            System.out.println(eachProperty.getSize());
            System.out.println(eachProperty.getType());
            System.out.println(eachProperty.getPrice());
            System.out.println(eachProperty.getLocationState());
        }

    }
}
