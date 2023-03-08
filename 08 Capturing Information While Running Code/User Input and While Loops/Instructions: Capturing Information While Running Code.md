
# Capturing Information While Running Code

## Introduction

A new talking parrot coin bank is being brought to market. It can be programmed to mimic phrases just as real parrots can. It will repeat the provided phrases the number times it is instructed to do so when money is added to it. In this activity you will implement methods that control this functionality.

All coding for this activity should be done within the PollyBank class:  `src/main/java/com/ata/PollyBank.java`

## Step 1 of User Input and While Loops

First you will need to get access to the Scanner class, which will be used to capture user input.

1.  Add a Scanner import statement to the top of the class file. Recall that the Scanner class is in the  `java.util`  package.
2.  Create a  `new`  class member object of the  `Scanner`  type and assign it to a variable named  `keyboard`.

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of User Input and While Loops

Now you can use the Scanner object to collect user data.

In the  `updatePhrase`  method:

1.  After the prompt for a phrase, capture the user’s response in the  `phrase`  variable by calling the  `nextLine`  method on the  `keyboard`  object.
2.  After the prompt for a number of repeats, call the  `nextInt`  method on the  `keyboard`  object to capture and store user input in the  `repeatNumber`  variable.
3.  Next call the  `nextLine`  method on  `keyboard`  to move input reading to a new line.

Run  `run-workflow step-02`  in your terminal to validate your work before you move to step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of User Input and While Loops

The user should be able to enter various amounts of money until they are done adding to the bank.

In the  `addMoney`  method:

1.  Under the amount prompt to the user, add a while loop that will execute when the value entered is a double.
2.  In the loop, retrieve the  `double`  amount that the user enters.
3.  Next in the loop, add the amount to the  `balance`  variable.
4.  Then in the loop, call the  `nextLine`  method on the Scanner object to move to a new line.
5.  At the end of the loop body, write another while loop that prints the user provided  `phrase`  the number of times the user entered as  `repeatNumber`. This will require you to create a local variable as an increment counter, and use the variable in the test expression for the loop. Each repeat of the phrase should be printed on a separate line using the  `println`  method.
6.  At the end of the outer loop use the  `System.println`  method to display the message  `"Enter another amount to add or any other key to stop"`.

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Running the Program

You can run the program to interact with the methods you are implemented by clicking the  **Run**  button. You will see the output and prompts for input in the terminal.

**Sample Terminal Input/Output:**

`What is the phrase to mimic?  
Polly wants coins  
How many times should it be repeated?  
2  
How much money is being added to Polly?  
5.00  
Polly wants coins  
Polly wants coins  
Enter another amount to add or any other key to stop  
.25  
Polly wants coins  
Polly wants coins  
Enter another amount to add or any other key to stop  
q  
The Polly Bank Balance is $5.25  
Goodbye`

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
