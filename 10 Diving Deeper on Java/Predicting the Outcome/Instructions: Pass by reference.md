
# Pass by reference

## Introduction to Pass by reference

In this activity, you will be trying out pass by reference. You will be updating a  `BankAccount`  object that is passed into the methods in a  `Teller`  class you will be implementing.

Recall that when you pass an object into a method, you are actually passing a reference to the object that points to the object. So updating the object in the method will also update the original object you passed into the method.

For the following activity, the  `BankAccount`  class has already been created for you and is located at`resource/asnlib/public/src/main/java/com/ata/BankAccount.java`

Here is the UML diagram for the  `BankAccount`  class.

![alt "Bank Account Diagram"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/bank_account.png)

All work should be done in the  `Teller`  class located in  `work/src/main/java/com/ata/Teller.java`under the corresponding TODO.

## Step 1 of Pass by reference

A teller needs to be able to deposit money into a bank account, so the first method will be to deposit money.

Implement the logic for depositing money in the  `depositMoney`  method under the comment  `TODO: Step 1: Implement depositMoney logic`  the following way:

-   Use the  `bankAccount`  object’s  `deposit`  method to deposit the  `amount`  into the bank account.

Run  `run-workflow step-01`  in your terminal to validate your work for step 1.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Pass by reference

The next thing a teller needs to do is withdraw money for the customer.

Implement the logic for withdrawing money in the  `withdrawMoney`  method under the comment  `TODO: Step 2: Implement withdrawMoney logic`  the following way:

-   Use the  `bankAccount`  object’s  `withdraw`  method to withdraw the  `amount`  from the bank account.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of Pass by reference

The last thing we want our teller to be able to do is update the account owner.

Implement the logic for updating the owner in the  `updateOwner`  method under the commnet  `TODO: Step 3: Implement updateOwner logic`  the following way:

-   Use the  `bankAccount`  object’s  `setOwner`  method to update the bank account’s owner to  `newOwner`.

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Step 4 of Pass by reference

Now that we have some basic methods, let’s implement the final method that will call all those other methods to show passing by reference in action.

In the final method  `doTransaction`  under the comment  `TODO: Step 4: Implement doTransaction logic`, do the following:

-   (Optional) Call  `System.out.println`  on the  `bankAccount`  object to see initial values.
-   Call the  `depositMoney`  method, passing in the arguments  `bankAccount`  and  `depositAmount`.
-   (Optional) Call  `System.out.println`  on the  `bankAccount`  object to see values after the deposit.
-   Call the  `withdrawMoney`  method, passing in the arguments  `bankAccount`  and  `withdrawAmount`.
-   (Optional) Call  `System.out.println`  on the  `bankAccount`  object to see values after withdrawal.
-   Call the  `updateOwner`  method, passing in the arguments  `bankAccount`  and  `newOwner`.
-   (Optional) Call  `System.out.println`  on the  `bankAccount`  object to see values after updating the owner.

A  `main`  method has been provided in the  `Teller`  class along with a sample  `BankAccount`  object. If you have added the print statements to the  `doTransaction`  method, you can click the  **Run**  button see the  `bankAccount`  being updated along the way in the terminal. Feel free to edit the parameters passed in to the  `doTransaction`  method.

Run  `run-workflow step-04`  in your terminal to validate your work for step 4.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-04`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
