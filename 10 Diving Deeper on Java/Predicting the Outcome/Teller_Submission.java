package com.ata;

import java.math.BigDecimal;

public class Teller {

    /**
    * Deposit money into a Bank Account class to show pass by reference.
    *
    * @param bankAccount a BankAccount class
    * @param amount amount to add to bankAccount
    * */
    public void depositMoney(BankAccount bankAccount, BigDecimal amount) {
        // TODO: Step 1: Implement depositMoney logic
        bankAccount.deposit(amount);
    }

    /**
     * Withdraw money from a Bank Account class to show pass by reference.
     *
     * @param bankAccount a BankAccount class
     * @param amount amount to withdraw from bankAccount
     * */
    public void withdrawMoney(BankAccount bankAccount, BigDecimal amount) {
        // TODO: Step 2: Implement withdrawMoney logic
        bankAccount.withdraw(amount);
    }

    /**
     * Update the owner of Bank Account class to show pass by reference.
     *
     * @param bankAccount a BankAccount class
     * @param newOwner the new owner for bankAccount
     * */
    public void updateOwner(BankAccount bankAccount, String newOwner) {
        // TODO: Step 3: Implement updateOwner logic
        bankAccount.setOwner(newOwner);
    }

    /**
     * Does a whole transaction to show pass by ref.
     *
     * @param bankAccount a BankAccount class
     * @param depositAmount amount to add to bankAccount
     * @param withdrawAmount amount to withdraw from bankAccount
     * @param newOwner the new owner for bankAccount
     * */
    public void doTransaction(BankAccount bankAccount, BigDecimal depositAmount,
                              BigDecimal withdrawAmount, String newOwner) {
        // TODO: Step 4: Implement doTransaction logic
        depositMoney(bankAccount, depositAmount);
        withdrawMoney(bankAccount, withdrawAmount);
        updateOwner(bankAccount, newOwner);
    }

    /**
     * Main method to test methods.
     *
     * @param args the main method args
     * */
    public static void main(String[] args) {
        Teller teller = new Teller();
        BigDecimal balance = new BigDecimal(10_000);
        BankAccount bankAccount = new BankAccount("John", balance);

        BigDecimal depositAmount = new BigDecimal(1000);
        BigDecimal withdrawAmount = new BigDecimal(2000);
        String newOwner = "Ana";

        teller.doTransaction(bankAccount, depositAmount, withdrawAmount, newOwner);
    }
}
