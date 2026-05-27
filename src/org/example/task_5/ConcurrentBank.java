package org.example.task_5;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentBank {

    //  Реализуйте класс ConcurrentBank для управления счетами и выполнения переводов между ними.
    //  Класс должен предоставлять методы
    //  createAccount -  для создания нового счета
    //  transfer - для выполнения переводов между счетами.
    //  BigDecimal? synch{}?

    ConcurrentBank bank = new ConcurrentBank();
    private final ConcurrentHashMap<Integer, BankAccount> accounts = new ConcurrentHashMap<>();


    public BankAccount createAccount(Integer idWallet, BigDecimal deposit) {
        BankAccount account = new BankAccount(deposit);
        accounts.put(idWallet, account);
        return account;
    }

    public void transfer(BankAccount debitAcc, BankAccount creditAcc, BigDecimal sum) {
        synchronized (accounts) {
            if (debitAcc.getBalance().compareTo(sum) >= 0) {
                debitAcc.withdraw(sum);
                creditAcc.deposit(sum);
            }
        }
    }

    public synchronized BigDecimal getTotalBalance() {
        BigDecimal total = BigDecimal.ZERO;
        for(BankAccount account : accounts.values()) {
            total = total.add(account.getBalance());
        }
        return total;
    }
}
