
# Encapsulation with setters and getters

## Introduction to encapsulation with setters and getters

Your boss has just given you another assignment. In this assignment, you will be finishing an existing class that another programmer has started.

In this activity, you will be using encapsulation to finish an existing class.

For this activity recall that:

-   Getter methods start with the word  `get`, take no arguments, and return the value of the attribute.
-   Setter methods start with the word  `set`, take a single argument of the same type as the attribute, and return void.
-   Using the  `this`  variable to distinguish between the attribute and the argument to a method or constructor.

In this activity, all work will be done in the  `Employee`  class located in  `work/src/main/java/com/ata/Employee.java`  under the respective  `TODO`.

## Step 1 of encapsulation with setters and getters

Right now, the  `name`  and  `numberOfCompanyShares`  don't have access modifiers. We want to make them  `private`. Make the attributes  `private`  by adding the  `private`  keyword before the attributes.

Implement your work under  `TODO: Step 1 make these attributes private`.

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of encapsulation with setters and getters

Now that we have made the attributes of  `Employee`  private, we need a way to set those values. The first way we will be doing that is implementing the constructor to accept the  `name`  and  `numberOfCompanyShares`  and setting the attributes to those values. Use the  `this`  reference to set the attributes to the passed in arguments from the constructor.

HINT: Use expressions like  `this.name = name;`  to do the job.

Implement your work under  `// TODO: Step 2 set the attributes to the values of the arguments using "this".`

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of encapsulation with setters and getters

Another way to set private variables is to use setter methods. In this step, add and implement setter methods for the two attributes.

Implement your work under  `// TODO: Step 3 add setter methods for the attributes.`

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Step 4 of encapsulation with setters and getters

Now that we have a way to set attribute values, we also need a way to get those values. Add and implement getter methods for the two attributes.

Implement your work under  `// TODO: Step 4 add getter methods for the attributes.`

Run  `run-workflow step-04`  in your terminal to validate your work for step 4.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-04`  passes with "BUILD SUCCESSFUL"

## Step 5 of encapsulation with setters and getters

Great! Our  `Employee`  class is almost complete. We want to add one last thing. A method called  `addShares`.`addShares`  should have the following features:

1.  Be a public method.
2.  Takes in  `int`  as an argument called  `numberOfShares`  and returns an  `int`.
3.  Increase the current  `numberOfCompanyShares`  by  `numberOfShares`.
4.  Return the  `numberOfCompanyShares`.

Here is a pseudocode of how it should be implemented:

```
method addShares(numberOfShares):
    numberOfCompanyShares = numberOfCompanyShares + numberOfShares
    return numberOfCompanyShares
```

Implement your work under  `TODO: Step 5 add and implement the addShares method.`

Run  `run-workflow step-05`  in your terminal to validate your work for step 5.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-05`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
