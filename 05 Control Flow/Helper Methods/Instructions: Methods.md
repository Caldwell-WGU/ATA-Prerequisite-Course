
# Methods

Creating and Calling Methods

## Introduction

This activity will have you work on a class that can calculate the division result of two  `int`  (integer) type values. You will add methods to do certain tasks and call them to be executed.

**Recall method syntax:**

```java
returnType methodName(paramType paramName) {
    // methodBody
}
```

**Remember that statements must end with a semicolon (`;`)**

All code implementation for this activity should be done within the  `IntDivider`  class:  `work/src/main/java/com/ata/IntDivider.java`

## Step 1 of Methods - Non-Void Method

1.  Create a method called  `divide`(below the comment for this step) that takes in two  `int`  parameters named  `integer1`  and  `integer2`(as shown in the comment).
2.  In the body of the method, use an  `if`  conditional to check if the second parameter is equal to zero, and if so throw a new  `IllegalArgumentException`  with the message,  `"The second parameter cannot be zero"`.
3.  After the  `if`  block, use the correct arithmetic operator to divide the first parameter by the second one and return the result as a  `double`  type.  _Remember to use casting, which can prevent data loss._

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Methods - Void Method

1.  Define a method named  `printResult`  (below the comment for this step). It should not return a value or accept any parameters.
2.  Declare an instance variable named  `currentResult`  of the  `double`  data type, but do not initialize it.
3.  In the body of the method call the  `System.out.println()`  method using the  `currentResult`instance variable as the argument.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

Run  `run-workflow step-02`  in your terminal to validate your work before you move to step 3.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of Methods - Calling Methods

1.  Update the  `calculate`  method body, so it calls the divide method. Use this method's two parameters (in their listed order) as arguments.
2.  Use the returned value from the method call above to assign the  `currentResult`  instance variable a value.
3.  Next, call the  `printResult`  method.

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
