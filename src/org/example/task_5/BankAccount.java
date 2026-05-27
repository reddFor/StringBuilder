package org.example.task_5;

import java.math.BigDecimal;

public class BankAccount {

    // крейт BankAccount с методами
    // deposit, - додеп
    // withdraw - снятие
    // getBalance - получения депа

    public BankAccount(BigDecimal balance) {
        this.balance = balance;
    }

    private BigDecimal balance;

    public synchronized void deposit(BigDecimal sum) {
        balance = balance.add(sum);
    }

    public synchronized void withdraw(BigDecimal sum) {
       if(balance.compareTo(sum) >= 0) {
          balance = balance.subtract(sum);
       }
    }

    public synchronized BigDecimal getBalance() {
        return balance;
    }

}
