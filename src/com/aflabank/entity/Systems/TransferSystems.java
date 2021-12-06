package com.aflabank.entity.Systems;

import Entity.Account;
import Entity.Bill;

public class TransferSystems {

    public void transfer (Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();
        if (billFromAmount < amount) {
            System.out.println("Перевод невозможен, нехватает средств на счету");
        } else {
            System.out.println("Перевод средст....  " +
                    accountFrom.getAccountHolder().getName() + " на аккаунт - " + accountTo.getAccountHolder().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно совершен");
        }

    }
}
