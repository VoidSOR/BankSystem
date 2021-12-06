package com.aflabank.entity.Systems;

import Entity.Account;
import Entity.Bill;

public class DepositSystems {

    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();

        int currentBillAmount = bill.getAmount();
        System.out.println("Пополнение счета..." + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Средства были зачисленный на счет:   " + bill.getAmount());


    }
}
