package com.example.abstractfactorypattern;

import com.example.abstractfactorypattern.Bank;
import com.example.abstractfactorypattern.Loan;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);

}
