package com.ata;

class LoyaltyAccount {

    String memberId;
    long rewardPoints;

    /**
     * This is a parameterized constructor.
     * 
     * @param id the member id to be set for the new object
     */


    /**
     * This is a no-arg constructor.
     */


    /**
     * This is an all-args constructor.
     * 
     * @param id     the member id to be set for the new object
     * @param points the number of member rewards points
     */


    /**
     * This method prints the account details.
     */
    void display() {
        System.out.println("Loyalty Account Details: ");
        System.out.print("Member Id: ");
        System.out.println(memberId);
        System.out.print("Points: ");
        System.out.println(rewardPoints);
        System.out.println();
    }

    /**
     * This method is where a Java program starts running.
     * Create and use objects here.
     * 
     * @param args Arguments sent into the program on run
     */
    public static void main(String[] args) {
        
    }

}
