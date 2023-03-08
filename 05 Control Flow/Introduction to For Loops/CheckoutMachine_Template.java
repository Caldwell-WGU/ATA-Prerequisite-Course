package com.ata;

public class CheckoutMachine {

    
    /*
    * This method will calculate the total weight of a list of weights.
    * @param weights a float array that contains the list of weights
    * @param hasLoyaltyCard
    * @return a float
    * */
    float calculateWeight(float[] weights, boolean hasLoyaltyCard) {
        float totalWeight = 0;
        // TODO: Step 1 work goes between the two comments
        for (int i = 0; i < weights.length; i++){
            float weight = weights[i];
            if (hasLoyaltyCard && weight < 20){
                totalWeight += weight * .95;
            } else {
                totalWeight += weight;
            }
        }
        //
        return totalWeight;
    }

}
