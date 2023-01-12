package com.example.abstractfactorypattern.Banks;

import com.example.abstractfactorypattern.Bank;

public class ICICI implements Bank {

    private final String BNAME;
    public ICICI(){
        BNAME="ICICI BANK";
    }
    @Override
    public String getBankName() {
        return null;
    }
}
