
# For loops

## Introduction

You just got hired at your first programming job. You are very excited and want to get to work as soon as possible. Shortly after, your new manager comes in and gives you your first assignment.

A company needs help creating software for their checkout machine. This company works on a model of payment where instead of charging for each item, they charge based on the total weight of the items. Your task is to create the part of the software that calculates the total weight of individual items. For this activity, you will need to be able to use for loops to do repeated actions and declare local variables within the for loop.

Recall the syntax for a for loop

```
for (initialExpression; testExpression; updateExpression) {
    // body of the loop
}
```

## Step 1 for loops - local variables

For your part, are given an array called  `weights`  that contains  `floats`  representing the weight of the items. You want to sum up all the weights in the  `weights`  array. There is a condition though. If a customer also has a loyalty card (`hasLoyaltyCard`), all items under 20 oz (0.76 kg) will have 5% taken of its weight or 95% the original weight.

These variables will be available for you to use:

-   a  `float`  array called  `weights`.
-   a  `boolean`  called  `hasLoyaltyCard`.
-   a  `float`  called  `totalWeight`.

Your code will be done within the  `CheckoutMachine`  class located at this path:`work/src/main/java/com/ata/CheckoutMachine.java`

Specifically, your code will be within the  `calculateWeight`  method of the code under the  `// TODO: Step 1 work goes between the two comments`  and before the other  `//`

Between the those two comments, do the following:

1.  Create a  `for`  loop that goes through the whole  `weights`  array.
2.  Within the  `for`  loop, do the following:
    -   Create a local variable of type  `float`  called  `weight`  to store the value of weights at a specific index.
    -   Create a conditional that checks whether  `weight`  is under 20 and whether  `hasLoyaltyCard`  is true and multiple  `weight`  by 0.95 if it is.
    -   Add  `weight`  to  `totalWeight`  the variable.

Once done, run  `run-workflow step-01`  in your terminal to validate your work for step 1.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of for loops - troubleshooting

You have just finished your program to calculate the total weight of an array of weights from the first activity. You decided to take a break. You go grab a cup of coffee before going back to work. When you get back, you see your cat playing around with your keyboard. You run over quickly and see that your cat has messed up your code. Can you fix what your cat did to your code?

Fix the code in the  `CheckoutMachineTroubleshoot`  class:  `work/src/main/java/com/ata/CheckoutMachineTroubleshoot.java`

Hint: In the  `CheckoutMachineTroubleshoot`  class, there is a main method that can be run to test out the  `calculateWeight`  method. You can update  `weights`  and  `hasLoyaltyCard`  to include any values you want to test out. Once you have added values you want to test, click on the  **Run**  button to test out your values and changes. You will see the text  `Total weight:`  follow by the total weight. You can compare that to what you expect the total weight to be based off the code and make changes a necessary.

Once done, run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
