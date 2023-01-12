package com.example.abstractfactorypattern;


public abstract class Loan {

    protected double rate;
    protected abstract void getInterestRate(double rates);

    public void calculateLoanPayment(double loanamount, int years){

        double emi;
        int n;

        n = years * 12;
        rate = rate / 100;
        emi = ((rate * Math.pow((1 + rate),n))/((Math.pow((1 + rate),n)-1)) * loanamount);

        System.out.println("your monthly EMI is "+ emi +" for the amount"+ loanamount +" you have borrowed");
    }
}
