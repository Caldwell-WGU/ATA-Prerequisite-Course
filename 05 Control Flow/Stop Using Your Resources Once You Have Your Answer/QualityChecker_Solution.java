package com.ata;

public class QualityChecker {

    /*
     * Calculates the average sugar content of a batch of fruit punch before a certain threshold
     * @param sugarContents a double array containing the sugar content of a batch of fruit punch
     * @param threshold     the threshold that the sugar content needs to be below
     * @return              the average sugar content before a threshold
     * */
    double qcMachine(double[] sugarContents, double threshold) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < sugarContents.length; i++) {
            double sugarContent = sugarContents[i];
            if (sugarContent >= threshold) {
                break;
            }
            count += 1;
            sum += sugarContent;
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

}
