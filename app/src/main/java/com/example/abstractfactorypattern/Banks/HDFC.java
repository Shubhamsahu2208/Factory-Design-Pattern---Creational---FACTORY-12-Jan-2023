package com.example.abstractfactorypattern.Banks;

import com.example.abstractfactorypattern.Bank;

public class HDFC implements Bank {

    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }

    @Override
    public String getBankName() {
        return null;
    }
}
