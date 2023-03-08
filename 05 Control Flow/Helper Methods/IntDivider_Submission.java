package com.ata;

public class IntDivider {
    double currentResult;

    /**
     * Step 1: This method divides an integer value by another integer value.
     * 
     * @param integer1 number to be divided
     * @param integer2  number to divide the dividend by
     * @return quotient or result of the division
     */
    double divide(int integer1, int integer2) {
        if (integer2 == 0) {
            throw new IllegalArgumentException("The second parameter cannot be zero");
        }

        double result = (double) integer1 / integer2;
        return result;
    }

    /**
     * Step 2: This method displays the calculation result.
     */
    void printResult() {
        System.out.println(currentResult);
    }

    /**
     * Step 3: This method calls other methods to do a calculation the display the
     * result.
     * 
     * @param number1 first integer in calculation
     * @param number2 second integer in calculation
     */
    void calculate(int number1, int number2) {
        currentResult = divide(number1, number2);
        printResult();
    }

}
