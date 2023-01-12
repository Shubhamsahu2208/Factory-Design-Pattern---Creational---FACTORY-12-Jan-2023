package com.example.abstractfactorypattern.Loans;


import com.example.abstractfactorypattern.Loan;

public class BussinessLoan extends Loan {
    @Override
    protected void getInterestRate(double rates) {
        rate = rates;

    }
}
