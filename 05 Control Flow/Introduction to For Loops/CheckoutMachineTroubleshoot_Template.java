package com.ata;

public class CheckoutMachineTroubleshoot {
    /*
     * This method will calculate the total weight of a list of weights. There are
     * currently issues with the code that needs to be fixed. This will
     * not pass the test until the errors are fixed.
     * @param weights a float array that contains the list of weights
     * @param hasLoyaltyCard
     * @return a float
     * */
    float calculateWeight(float[] weights, boolean hasLoyaltyCard) {
        float totalWeight = 0;
        // TODO: Fix the errors in the code between this comment and the last comment
        // so that it passes all the test. You can go down to the main method to test
        // it out by entering your own weights and hasLoyaltyCard boolean value to test
        // out your fixes
        for (int i = 0; i < weights.length; i++) {
            float weight = weights[i];
            if (weight < 20f && hasLoyaltyCard) {
                weight *= 0.95;
            }
            totalWeight += weight;
        }
        //
        return totalWeight;
    }

    public static void main(String[] args) {
        // TODO: Update these two variables with values you want to test if you want
        float[] weights = {1f, 10f, 100f};
        boolean hasLoyaltyCard = false;
        //

        // DO NOT EDIT
        CheckoutMachineTroubleshoot checkoutMachineTroubleshoot = new CheckoutMachineTroubleshoot();
        float totalWeight = checkoutMachineTroubleshoot.calculateWeight(weights, hasLoyaltyCard);
        System.out.println("Total weight: " + totalWeight);
    }
}
