package com.seleniummaster.tutorial.Homework;

public class Client {
    //lastName, firstName, gender, VIP, birthDate, medicareNumber,privateHealthFund, phone,
    // email,address, suburb, postCode, referralSource, occupation, notes
    private String lastName;
    private String firstName;
    private String gender;
    private String  VIP;
    private String birthDate;
    private String medicareNumber;
    private String privateHealthFund;
    private String phone;
    private String email;
    private String address;
    private String suburb;
    private String postCode;
    private String referralSource;
    private String occupation;
    private String notes;

    public Client() {
    }

    public Client(String lastName, String firstName, String gender, String VIP, String birthDate, String medicareNumber, String privateHealthFund, String phone, String email, String address, String suburb, String postCode, String referralSource, String occupation, String notes) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.VIP = VIP;
        this.birthDate = birthDate;
        this.medicareNumber = medicareNumber;
        this.privateHealthFund = privateHealthFund;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.suburb = suburb;
        this.postCode = postCode;
        this.referralSource = referralSource;
        this.occupation = occupation;
        this.notes = notes;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String isVIP() {
        return VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMedicareNumber() {
        return medicareNumber;
    }

    public void setMedicareNumber(String medicareNumber) {
        this.medicareNumber = medicareNumber;
    }

    public String getPrivateHealthFund() {
        return privateHealthFund;
    }

    public void setPrivateHealthFund(String privateHealthFund) {
        this.privateHealthFund = privateHealthFund;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getReferralSource() {
        return referralSource;
    }

    public void setReferralSource(String referralSource) {
        this.referralSource = referralSource;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", VIP=" + VIP +
                ", birthDate='" + birthDate + '\'' +
                ", medicareNumber=" + medicareNumber +
                ", privateHealthFund='" + privateHealthFund + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", suburb='" + suburb + '\'' +
                ", postCode=" + postCode +
                ", referralSource='" + referralSource + '\'' +
                ", occupation='" + occupation + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}