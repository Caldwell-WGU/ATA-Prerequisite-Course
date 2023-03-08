package com.ata;

public class CheckoutMachineTroubleshoot {

    /*
     * This method will calculate the total weight of a list of weights.
     * @param weights a float array that contains the list of weights
     * @param hasLoyaltyCard
     * @return a float
     * */
    float calculateWeight(float[] weights, boolean hasLoyaltyCard) {
        float totalWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            float weight = weights[i];
            if (weight < 20f && hasLoyaltyCard) {
                weight *= 0.95;
            }
            totalWeight += weight;
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        float[] weights = {1f, 10f, 100f};
        boolean hasLoyaltyCard = false;

        CheckoutMachineTroubleshoot checkoutMachineTroubleshoot = new CheckoutMachineTroubleshoot();
        float totalWeight = checkoutMachineTroubleshoot.calculateWeight(weights, hasLoyaltyCard);
        System.out.println("Total weight: " + totalWeight);
    }
}
