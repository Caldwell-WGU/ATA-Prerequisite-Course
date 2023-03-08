package com.ata;

public class ConditionalStatements {

    /**
     * This method is used for problem one in the README.
     * @param price A price that will be passed in by the test.
     * @return String A string used to validate the test.
     */
    public String simpleConditional(int price) {
        String answer = null;
        // TODO: Write Step 1 code between the forward slashes
        if (price < 20){
            answer = "Buying new shirt";
        }

        //
        return answer;
    }

    /**
     * This method is used for problem two in the README.
     * @param weather A weather string that will be passed in by the test.
     * @return String A string used to validate the test.
     */
    public String singleBranchConditional(String weather) {
        String answer = null;
        // TODO: Write Step 2 code between the forward slashes
        if ( weather.equals("sunny")){
            answer = "Going for a jog";
        } else {
            answer = "Not going for a jog";
        }

        //
        return answer;
    }

    /**
     * This method is used for problem three in the README.
     * @param day A day of the week that will be passed in by the test.
     * @return String A string used to validate the test.
     */
    public String multipleBranchConditional(String day) {
        String answer = null;
        // TODO: Write Step 3 code between the forward slashes
        if (day.equals("Friday")){

            answer = "Mexican";
        } else if (day.equals("Saturday")){

            answer = "Chinese";
        } else if (day.equals("Sunday")){

            answer = "American";
        } else {

            answer = "Eating In";
        }

        //
        return answer;
    }

}
