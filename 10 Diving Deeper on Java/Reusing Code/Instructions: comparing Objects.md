
# Comparing Objects

## Introduction to Comparing Objects

As we learned,  `Sets`  in Java are like  `ArrayLists`  only in that they contain unique values. Recall that when dealing with custom objects, what determines whether one object is different from another is the  `equals`  and  `hashCode`  method when dealing with  `Sets`.

So in this activity, we will be creating the  `equals`  and  `hashCode`  methods of the  `Person`  class. The  `Person`  class has already been provided to you but does not have the  `equals`  and  `hashCode`methods. Below is the UML diagram for the desired  `Person`  class.

![alt "Person UML"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/person_uml.png)

Recall that while not required, it is good practice to use the  `@Override`  annotation above the  `equals`  and  `hashCode`  methods like so

```
@Override
public boolean equals(Object other) {
// implementation goes here
}

@Override
public int hashCode() {
// implementation goes here
}
```

Recall that the  `this`  keyword is used to refer to the current object. Recall that you select which attributes are important when comparing objects and that if those attributes are equal, then two objects with the same values for those attributes are equal.

## Step 1 of Comparing Objects

Let’s start off creating the  `equals`  method.

For the  `Person`  class, we will say that two  `Person`objects are equal if and only if the  `firstName`and the  `lastName`  of both objects are equal.

Let’s break down how to create the  `equals`  method for the  `Person`  class so that it only looks at the  `firstName`  and  `lastName`  attributes to determine equivalence.

Create a  `equals`  method under the comment  `TODO: Step 1: Create the equals method`  that does the following:

-   Take in an  `Object`  class argument and call it  `other`.
-   Check if the current object and the other object is the same object by returning  `true`  if the current object (`this`) is equal to (using  `==`) as  `other`.
-   Check if the other object is  `null`  by returning  `false`  if  `other`  is  `null`.
-   Check if the other object is of the same class as the current object by returning false if  `getClass()`  is not equal to (using  `!=`) to  `other.getClass()`;.
-   Lastly, check if the other object’s  `firstName`  and  `lastName`  attributes are the same as the current objects by:
    -   First casting the other object into a  `Person`  class.
    -   Comparing if the current objects  `firstName`  and  `lastName`  are equal to the cast object’s`firstName`  and  `lastName`.

Run  `run-workflow step-01`  in your terminal to validate your work for step 1.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Comparing Objects

Let’s now create the  `hashCode`  method. As you saw in the topic, you could just use any arbitrary integer and call it the hash code. This is not a good hash code though.

Instead, we will be using a method called  `Objects.hash()`  to generate the hash code. The  `Objects.hash()`  method takes in any number of variables that you want to create a hash code from. While there are other ways to generate a hash code, using  `Objects.hash()`  does what we need for our purposes. To use the  `Objects.hash()`  method, we must first import it using  `import java.util.Objects`;

For the  `Person`  class, since we are saying that a unique  `Person`  object is defined by a unique  `firstName`  and  `lastName`, you will be using those to generate a hash code.

Create a  `hashCode`  method under the comment  `TODO: Step 2: Create the hashCode method`that does the following:

-   Returns the hash of the  `firstName`  and  `lastName`  using the  `Objects.hash() method`. Make sure to import the  `Objects`  class from the  `java.util`  package first before using  `Objects.hash()`.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
