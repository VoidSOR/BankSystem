package com.aflabank.entity;

import com.aflabank.entity.Systems.DepositSystems;
import com.aflabank.entity.Systems.PaymentSystem;
import Entity.Account;
import Entity.Bill;
import Entity.Person;
import com.aflabank.entity.Systems.TransferSystems;

public class Main {

    public static void main(String[] args) {
        Person nikitaPerson = new Person("Nikita", 89997, "Bodyagin");

        Bill nikitaBill = new Bill(3000);
        Account nikitaAccount = new Account(nikitaPerson,nikitaBill);

        Person slavaPerson = new Person("Slava", 41444, "Kraev");

        Bill slavaBill = new Bill(1000);
        Account slavaAccount = new Account(slavaPerson,slavaBill);

        Person maximPerson = new Person("Maxim", 312313,"Myxamor");

        Bill maximBill = new Bill(1323);
        Account maximAccount = new Account(maximPerson,maximBill);

        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.pay(nikitaAccount,806);
        paymentSystem.pay(slavaAccount, 124);


        DepositSystems depositSystems = new DepositSystems();
        depositSystems.deposit(maximAccount,4400);
        depositSystems.deposit(nikitaAccount, 3300);
        System.out.println("Степендия" + maximAccount);
        System.out.println("Степендия" + nikitaAccount);


        TransferSystems transferSystems = new TransferSystems();
        transferSystems.transfer(maximAccount,slavaAccount, 32332332);



    }
}
