package com.example.abstractfactorypattern.Factory;

import com.example.abstractfactorypattern.AbstractFactory;
import com.example.abstractfactorypattern.Bank;
import com.example.abstractfactorypattern.Loan;
import com.example.abstractfactorypattern.Loans.BussinessLoan;
import com.example.abstractfactorypattern.Loans.EducationLoan;
import com.example.abstractfactorypattern.Loans.HomeLoan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null){
            return null;
        }
        else if(loan.equalsIgnoreCase("Home")){
            return new HomeLoan();
        }
        else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        }
        else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }

        return null;
    }
}
