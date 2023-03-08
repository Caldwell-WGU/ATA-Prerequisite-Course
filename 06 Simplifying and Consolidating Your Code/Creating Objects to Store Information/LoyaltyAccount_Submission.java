package com.ata;

class LoyaltyAccount {

    String memberId;
    long rewardPoints;

    /**
     * This is a parameterized constructor.
     * 
     * @param id the member id to be set for the new object
     */
    public LoyaltyAccount (String id){
        memberId = id;
        rewardPoints = 500L;
    }


    /**
     * This is a no-arg constructor.
     */
    public LoyaltyAccount(){}

    /**
     * This is an all-args constructor.
     * 
     * @param id     the member id to be set for the new object
     * @param points the number of member rewards points
     */
    public LoyaltyAccount(String id, long points){
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
        LoyaltyAccount myObject0 = new LoyaltyAccount();
        myObject0.display();
        LoyaltyAccount myObject1 = new LoyaltyAccount("Bob");
        myObject1.display();
        LoyaltyAccount myObject2 = new LoyaltyAccount("Joe", 5L);
        myObject2.display();
    }

}
