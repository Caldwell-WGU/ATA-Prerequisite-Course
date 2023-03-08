Creating Objects

Defining constructors, instantiating class types, and using objects

Introduction

All coding for this activity should be done within the LoyaltyAccount class: src/main/java/com/ata/LoyaltyAccount.java

A company decides to start a loyalty rewards program, which will award points based on customer purchases. These points can be used to get product discounts.

The provided LoyaltyAccount class has information that will be stored for each loyalty program participant. This means each program member will have an id and a number of points. Although the value of those variables can vary from one member to another, the class acts as a blueprint for the details each account will have. It has three class members(two variables and one method). The main method is also provided to test the class. There is currently no defined constructor. Even though a constructor is not defined in the class, Java provides a default one with no parameters.

Try It:

Test the default constructor.

In the main method, create a variable of the LoyaltyAccount type and initialize it with a new object using a call to the default constructor.
Call the display method using the object. Click the Run button to see the output in the terminal window. The two variables will have default values.
Now after that code update the values of the two variables using the same object and call the display method on it again. If you run the code again the second set of values displayed should reflect the updates you made.

Recall constructor syntax:

To Define:

ClassName(paramType paramName) {
// body
}

To Call:
new ClassName(paramType paramName);

Remember that statements must end with a semicolon(;)

Step 1 Parameterized Constructor

The company decides to give 500 bonus points for those who enroll in this new program. Add the first constructor to this class that accepts only a member id value. The constructor’s body should have code to update the memberId based on the passed in argument, and also set the rewardPoints to a value of 500.

Run run-workflow step-01 in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-01 passes with "BUILD SUCCESSFUL"
Try It:

Try to Run the code now, you will see that it fails. This is because a no-argument constructor is being called yet one is not defined, and the default constructor is not accessible since a parameterized constructor is now defined.

Comment out the statements created in the main method for step one.
Under the comments, create a new object(with a different variable name) using the new constructor with the correct argument type.
Then call the display method on the object.
Select the Run button to see the results.
Step 2 No-Argument(No-Arg) Constructor

Despite the need to set the member ids from the start in most cases, the company still wants to be able to create a member and update their details later. Overload the existing constructor by writing a no-argument constructor(no parameters) inside the LoyaltyAccount class. The body should be empty.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

Run run-workflow step-02 in your terminal to validate your work before you move to step 3.

You have completed this step when:

run-workflow step-02 passes with "BUILD SUCCESSFUL"
Try It:

In the main method uncomment out the default(no-argument) constructor code from earlier.
Select Run to see the same output as before since an object can now be created again without providing arguments to a constructor. The display should show the default values just like the initial default constructor call did.
Step 3 All-Arguments(All-Args) Constructor

The company is going to run several promotions for the program that award different values of sign up bonus points. They need to be able to create new members with an initial id and starting number of points. Create a constructor that will allow initial values for both variables to be set when a new instance of the LoyaltyAccount class is created.

Within the LoyaltyAccount class, define an all-arguments constructor that has parameters for each instance variable, with the id parameter being first. Within the body of the constructor, use the parameters to set the starting state of the new object(memberId, rewardPoints).

Run run-workflow step-03 in your terminal to validate your work for step 3.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-03 passes with "BUILD SUCCESSFUL"
Try It:

In the main method, add a call to the new constructor to create an instance of the class (use a different variable name).
Then call the display method on that object like the previous ones.
Select Run to see the results.
Submitting your work

You can ensure all tests pass before submitting by clicking the Build button. You will see BUILD SUCCESSFUL in your terminal. If tests are failing you will see BUILD FAILED with the failing test output above.

You may also run run-workflow test-all to validate all steps are passing.

Click the Submit button to submit your work and review your grade.
