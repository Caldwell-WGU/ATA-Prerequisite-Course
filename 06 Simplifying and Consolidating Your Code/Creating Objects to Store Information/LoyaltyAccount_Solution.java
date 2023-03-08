package com.ata;

class LoyaltyAccount {

    String memberId;
    long rewardPoints;

    /**
     * This is a parameterized constructor.
     * 
     * @param id the member id to be set for the new object
     */
    LoyaltyAccount(String id) {

        memberId = id;
        rewardPoints = 500;
    }

    /**
     * This is a no-argument constructor.
     */
    LoyaltyAccount() {

    }

    /**
     * This is an all-arguments constructor.
     * 
     * @param id     id the member id to be set for the new object
     * @param points the number of member rewards points
     */
    LoyaltyAccount(String id, long points) {
        memberId = id;
        rewardPoints = points;
    }

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
        LoyaltyAccount newShopper = new LoyaltyAccount("shopperId");
        newShopper.display();

        LoyaltyAccount emptyAcct = new LoyaltyAccount();
        emptyAcct.display();

        LoyaltyAccount promoShopper = new LoyaltyAccount("testId", 850);
        promoShopper.display();
    }

}
