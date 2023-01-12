package com.example.abstractfactorypattern.Loans;

import com.example.abstractfactorypattern.Loan;

public class HomeLoan extends Loan {


    @Override
    protected void getInterestRate(double rates) {
        rate = rates;
    }
}
