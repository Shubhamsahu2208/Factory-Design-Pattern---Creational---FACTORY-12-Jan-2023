package com.example.abstractfactorypattern.Banks;

import com.example.abstractfactorypattern.Bank;

public class SBI implements Bank {

    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }

    @Override
    public String getBankName() {
        return null;
    }
}
