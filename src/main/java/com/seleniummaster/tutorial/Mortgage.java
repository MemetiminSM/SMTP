package com.seleniummaster.tutorial;

public class Mortgage {
    private double homeValue;
    private double downPayment;
    private boolean dollar;
    private double loanAmount;
    private double interestRate;
    private int loanTerm;
    private String startMonth;
    private int startYear;
    private double propertyTax;
    private double pmi;
    private double homeIns;
    private double hoa;
    private String loanType;

    public Mortgage() {
    }

    public Mortgage(double homeValue, double downPayment, boolean dollar, double loanAmount, double interestRate, int loanTerm, String startMonth, int startYear, double propertyTax, double pmi, double homeIns, double hoa, String loanType) {
        this.homeValue = homeValue;
        this.downPayment = downPayment;
        this.dollar = dollar;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.propertyTax = propertyTax;
        this.pmi = pmi;
        this.homeIns = homeIns;
        this.hoa = hoa;
        this.loanType = loanType;
    }

    public double getHomeValue() {
        return homeValue;
    }

    public void setHomeValue(double homeValue) {
        this.homeValue = homeValue;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public boolean isDollar() {
        return dollar;
    }

    public void setDollar(boolean dollar) {
        this.dollar = dollar;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public double getPropertyTax() {
        return propertyTax;
    }

    public void setPropertyTax(double propertyTax) {
        this.propertyTax = propertyTax;
    }

    public double getPmi() {
        return pmi;
    }

    public void setPmi(double pmi) {
        this.pmi = pmi;
    }

    public double getHomeIns() {
        return homeIns;
    }

    public void setHomeIns(double homeIns) {
        this.homeIns = homeIns;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @Override
    public String toString() {
        return "Mortgage{" +
                "homeValue=" + homeValue +
                ", downPayment=" + downPayment +
                ", dollar=" + dollar +
                ", loanAmount=" + loanAmount +
                ", interestRate=" + interestRate +
                ", loanTerm=" + loanTerm +
                ", startMonth='" + startMonth + '\'' +
                ", startYear=" + startYear +
                ", propertyTax=" + propertyTax +
                ", pmi=" + pmi +
                ", homeIns=" + homeIns +
                ", hoa=" + hoa +
                ", loanType='" + loanType + '\'' +
                '}';
    }
}
