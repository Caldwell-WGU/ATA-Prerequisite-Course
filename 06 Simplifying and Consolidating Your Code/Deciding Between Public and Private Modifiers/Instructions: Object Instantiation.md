
# Object Instantiation

## Introduction to object instantiation

Object instantiation is an important part of Java since everything in Java is a class. That's why in you new job as a programmer, your boss wants you to practice creating some objects from existing class.

In this activity you will be instantiating objects hands on using a  `Form`  and a  `Temperature`  class that is already created for you.

Here are some things you need to recall for this activity: Object instantiation:

```
ClassName object = new ClassName();
ClassName object = new ClassName(argument1, argument2, … );
```

Methods: Returning a value from a method requires you specify the data type.

```
// returns the string "hello world"
public String methodName() {
    return "hello world";
}
```

Classes: Classes are custom data types and can also be returned by methods like normal data types.

For the following activity, the  `Form`  and  `Temperature`  classes have already been created for you and is located  `path/to/asnlib/main`

All work should be done in the  `ObjectInstantiation`  class located in  `work/src/main/java/com/ata/ObjectInstantiation.java`  under the respective  `TODO`  comments.

## Step 1: Object instantiation with default constructor

In this part of the activity we will be creating an object from the provided  `Form`  class using the default constructor. Follow the steps below to achieve this.

1.  Create a new public method called  `createEmptyForm`  that will do the following:

-   Declare a variable and assign it to a new instance of the  `Form`  class.
-   Return the variable created.

Implement  `createEmptyForm()`  under the comment  `// TODO: Step 1: Create method createEmptyForm below`.

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2: Object Declaration followed by instantiation

Recall back to the previous topic about variables and how you can declare a variable first before initializing it to a value like so:

```
String myString;
myString = "hello world";
```

This can be done with objects as well. In this part of the activity we will practice declaring objects before instantiating them later. Follow the steps below to achieve this:

1.  Declare a private variable called  `myForm`  of type  `Form`  under the comment  `// TODO: Step 2.1: Declare a private Form object below called myForm.`

Run  `run-workflow step-02.1`  in your terminal to validate your work for step 2.1 before moving on to the next step.

2.  Create a public void method called  `instantiateMyForm`  that will do the following:

-   Instantiate a new  `Form`  object without parameters and assign it to the  `myForm`  variable declared in 1.

Implement  `instantiateMyForm()`  under the comment  `// TODO: Step 2.2: Create method instantiateMyForm below`.

Run  `run-workflow step-02.2`  in your terminal to validate your work for step 2.2

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   Both  `run-workflow step-02.1`  and  `run-workflow step-02.2`  passes with "BUILD SUCCESSFUL"

## Step 3: Object instantiation with multiple constructors

In this part of the activity, you will be instantiating objects that have mulitiple constructors. Follow the steps below to achieve this.

1.  Create a new public method called  `createTempObj`  that will do the following:

-   Declare a variable called  `myTemp`  and assign it to a new instance of  `Temperature`, passing in the parameter 32.
-   Return  `myTemp`  object.

Implement  `createCelsiusObject()`  under the comment  `// TODO: Step 3.1: Create method createTempObj below`.

Run  `run-workflow step-03.1`  in your terminal to validate your work for step 3.1 before moving on to the next step.

2.  Create a new public method called  `createTempObj2`  that will do the following:

-   Declare a variable called  `myTemp`  and assign it to a new instance of  `Temperature`, passing in the parameter 0 and true.
-   Return  `myTemp`  object.

Implement  `createTempObj2()`  under the comment  `// TODO: Step 3.2: Create method createTempObj2 below`.

Run  `run-workflow step-03.2`  in your terminal to validate your work for step 3.2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   Both  `run-workflow step-03.1`  and  `run-workflow step-03.2`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
