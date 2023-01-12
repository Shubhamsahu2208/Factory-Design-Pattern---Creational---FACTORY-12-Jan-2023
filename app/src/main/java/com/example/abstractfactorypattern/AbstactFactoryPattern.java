package com.example.abstractfactorypattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.abstractfactorypattern.Factory.FactoryCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstactFactoryPattern{

    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of Bank from where you want to take loan amount: ");
        String bankName = bufferedReader.readLine();
        System.out.println("\n");
//        System.out.println();

        System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");

        String loanName=bufferedReader.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b=bankFactory.getBank(bankName);

        System.out.print("\n");
        System.out.print("Enter the interest rate for "+b.getBankName()+ ": ");

        double rate=Double.parseDouble(bufferedReader.readLine());
        System.out.print("\n");
        System.out.print("Enter the loan amount you want to take: ");

        double loanAmount=Double.parseDouble(bufferedReader.readLine());
        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years=Integer.parseInt(bufferedReader.readLine());

        System.out.print("\n");
        System.out.println("you are taking the loan from "+ b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l=loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);
    }
}