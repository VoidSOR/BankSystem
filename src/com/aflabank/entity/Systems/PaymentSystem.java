package com.aflabank.entity.Systems;

import Entity.Account;
import Entity.Bill;

public class PaymentSystem {

    public void pay(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Платеж невозможен,платеж превышает кол-во денег на счету");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происхиодит операция платежа,текущее количество средств на вашем счету:  " + bill.getAmount());
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж успешно завершен, новое значение ваших средств на счету:  " + bill.getAmount());

            System.out.println("..................................................................");

        }

    }
}
