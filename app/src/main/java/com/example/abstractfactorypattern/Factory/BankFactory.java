package com.example.abstractfactorypattern.Factory;

import com.example.abstractfactorypattern.AbstractFactory;
import com.example.abstractfactorypattern.Bank;
import com.example.abstractfactorypattern.Banks.HDFC;
import com.example.abstractfactorypattern.Banks.ICICI;
import com.example.abstractfactorypattern.Banks.SBI;
import com.example.abstractfactorypattern.Loan;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {

        if (bank == null) {
            return null;
        }

        if (bank.equalsIgnoreCase("HDFC")) {
            return new HDFC();
        } else if (bank.equalsIgnoreCase("ICICI")) {
            return new ICICI();
        } else if (bank.equalsIgnoreCase("SBI")) {
            return new SBI();
        }

        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
