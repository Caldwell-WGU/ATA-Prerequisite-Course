package com.ata;

import java.util.Scanner;

public class PollyBank {
    
    double balance = 0.0;
    String phrase = "";
    int repeatNumber = 0;
    // TODO: Step 1 - add Scanner type variable
    Scanner keyboard = new Scanner(System.in);

    /**
     * Modifies the text that is mimicked by the bank.
     */
    public void updatePhrase() {
        System.out.println("What is the phrase to mimic?");
        // TODO: Step 2.1 - capture a line of text to be repeated
        phrase = keyboard.nextLine();

        System.out.println("How many times should it be repeated?");
        // TODO: Step 2.2 - capture the number of times for the text to be repeated
        repeatNumber = keyboard.nextInt();

        // TODO: Step 2.3 - move the Scanner object to the next line
        keyboard.nextLine();
    }
    
    /**
     * Adds various amounts to the bank balance.
     */
    public void addMoney() {
        System.out.println("How much money is being added to Polly?");

        // TODO: Step 3 - add a while loop for adding money
        while (keyboard.hasNextDouble()) {
            double amount = keyboard.nextDouble();
            balance += amount;
            keyboard.nextLine();

            int i = 1;

            while (i <= repeatNumber) {
                System.out.println(phrase);
                i++;
            }

            System.out.println("Enter another amount to add or any other key to stop");
        }

        System.out.print("The Polly Bank Balance is $");
        System.out.println(balance);
        System.out.println("Goodbye");
    }

}
