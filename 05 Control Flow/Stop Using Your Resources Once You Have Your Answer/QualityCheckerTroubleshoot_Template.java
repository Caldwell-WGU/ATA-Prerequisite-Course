package com.ata;

public class QualityCheckerTroubleshoot {

    /*
     * Fixes the quirk in the output of the machine and finds the average sugar content before a threshold.
     * @param sugarContents a double array containing the sugar contents that need to be adjusted
     * @param threshold     the threshold that the sugar content needs to be below
     * @return              the average sugar content before a threshold      * */
    double qcMachineQuirk(double[] sugarContents, double threshold) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < sugarContents.length; i++) {
            double sugarContent = sugarContents[i];
            double adjustedSugarContent = sugarContent / 10;
            count += 1;
            sum += adjustedSugarContent;
            if (adjustedSugarContent >= threshold) {
                break;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public static void main(String[] args) {
        // TODO: Update the two variables with the values you want to test
        double[] sugarContents = {250, 260, 270, 280, 290};
        double threshold = 28;

        QualityCheckerTroubleshoot qualityCheckerTroubleshoot = new QualityCheckerTroubleshoot();
        double averageSugarContent = qualityCheckerTroubleshoot.qcMachineQuirk(sugarContents, threshold);
        System.out.println("Average Sugar Content: " + averageSugarContent);
    }
}
