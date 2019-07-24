package com.seleniummaster.classtutorial;

public class JavaAutoClinicWise1 {
    //login,adding a new client and sign out
    private String userName;
    private String userPassword;
    private String firstname;
    private String lastname;
    private boolean IsMale;
    private String birthDate;
    private int medicareNumber;
    private String HealthFund;
    private long phone;
    private String email;
    private String address;
    private String suburb;
    private int postCode;
    private String referralSource;
    private String occupation;
    private String notes;

    public JavaAutoClinicWise1(String userName, String userPassword, String firstname, String lastname, boolean isMale, String birthDate, int medicareNumber, String healthFund, long phone, String email, String address, String suburb, int postCode, String referralSource, String occupation, String notes) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.firstname = firstname;
        this.lastname = lastname;
        IsMale = isMale;
        this.birthDate = birthDate;
        this.medicareNumber = medicareNumber;
        HealthFund = healthFund;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.suburb = suburb;
        this.postCode = postCode;
        this.referralSource = referralSource;
        this.occupation = occupation;
        this.notes = notes;
    }

    public JavaAutoClinicWise1() {

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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isMale() {
        return IsMale;
    }

    public void setMale(boolean male) {
        IsMale = male;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getMedicareNumber() {
        return medicareNumber;
    }

    public void setMedicareNumber(int medicareNumber) {
        this.medicareNumber = medicareNumber;
    }

    public String getHealthFund() {
        return HealthFund;
    }

    public void setHealthFund(String healthFund) {
        HealthFund = healthFund;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
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
}
