package com.ata;

public class PollyBank {
    
    double balance = 0.0;
    String phrase = "";
    int repeatNumber = 0;
    // TODO: Step 1 - add Scanner type variable

    /**
     * Modifies the text that is mimicked by the bank.
     */
    public void updatePhrase() {

        System.out.println("What is the phrase to mimic?");
        // TODO: Step 2.1 - capture a line of text to be repeated
        

        System.out.println("How many times should it be repeated?");
        // TODO: Step 2.2 - capture the number of times for the text to be repeated
        
        
        // TODO: Step 2.3 - move the Scanner object to the next line

    }
    
    /**
     * Adds various amounts to the bank balance.
     */
    public void addMoney() {
        System.out.println("How much money is being added to Polly?");


        // TODO: Step 3 - add a while loop for adding money
        
        
        System.out.print("Polly Bank Balance is $");
        System.out.println(balance);
        System.out.println("Goodbye");
    }

}
