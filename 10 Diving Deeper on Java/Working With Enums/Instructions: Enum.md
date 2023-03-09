
# Enum

## Introduction to Enum

After working very hard at your current job as a programmer, you have learned so much. Your boss thinks you are now ready for your next position in your career. Before your boss can promote you to the next level though, you are given one last project.

In this activity, you will be learning how to use  `enums`  by creating a program to show some elements from the periodic table based on their chemical symbol.

Since the periodic table of elements is so large (there are 118 elements), you will only be working with a sample of them instead of all of them. We’ll be working with the following six elements:

Carbon (C), Hydrogen (H), Oxygen (O), Nitrogen (N), Phosphorus (P), and Sulfur (S).

The name of the elements you will be working with are shown with the periodic symbol for the element in parentheses. These elements represent the six main elements that make up all living things.

Recall the necessary syntax for working with  `enums`.

```
// creating an enum class
public enum Directions {
    NORTH, EAST, SOUTH, WEST
}

// getting all the values for an Enum class
Directions[] values = Directions.values();

// getting the enum from a String.
Directions direction = Directions.valueOf("NORTH");
```

Also recall the necessary syntax for working an ArrayList

```
// importing the necessary class
import java.util.ArrayList;

// creating an ArrayList
ArrayList<data_type> list = new ArrayList<>();

// adding to ArrayList
list.add(value);
```

## Step 1 of working with enum

The first thing to do is create an  `enum`  to represent the elements.

In the provided  `enum`  `Element`  located at  `work/src/main/java/com/ata/Element.java`, add the chemical symbols (the single letter) as the values for the  `Element`  `enum`  under the comment  `TODO: Step 1: Added the periodic symbols as values`.

Run  `run-workflow step-01`  in your terminal to validate your work for step 1.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of working with enum

Now that we have the  `Element`  `enum`  completed, we can start using them. In this step, you will first create a method to translate the single letter periodic symbols to their respective elements.

In the provided  `PeriodicTable`  class located at  `work/src/main/java/com/ata/PeriodicTable.java`, implement the logic for the  `translateSymbol`  method under the comment  `TODO: Step 2: Add logic to return element string before return null;`.

Note, there are two  `translateSymbol`  methods that take in different parameter types. Make sure to implement the one that takes in the  `Element`  `enum`  data type.

In the  `translateSymbol`  method do the following:

-   Use conditional statements to check the passed in  `element`  variable against each  `Element`  `enum`  and return the corresponding element name. You do not need a  `else`statement since the default is to return  `null`.
-   For example, if  `element`  is equal to  `Element.C`, return the string  `Carbon`. Do this for each value in  `Element`.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of working with enum

Now that  `translateSymbol`  is implemented, let’s implement the overloaded  `translateSymbol`  that takes in a  `String`  type.

In the provided  `PeriodicTable`  class located at  `work/src/main/java/com/ata/PeriodicTable.java`, implement the logic for the  `translateSymbol`  method under the comment  `TODO: Step 3: Replace return null with logic for overloaded translateSymbol.`.

In this  `translateSymbol`  method do the following:

-   Use the  `valuesOf`  method to get the corresponding  `Element`  `enum`  data type from the  `elementStr`  argument.
-   Return the element string for the corresponding  `Element`  by calling the first  `translateSymbol`  method and passing in the  `Element`  as the argument to get the corresponding element string.

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Step 4 of working with enum

The last method we will be implementing for the  `PeriodicTable`  class will be the  `getElementsOfLife`  method. This method will print off the element string for the elements of life in the  `Elements`  `enum`.

In the provided  `PeriodicTable`  class located at  `work/src/main/java/com/ata/PeriodicTable.java`, implement the logic for the  `getElementsOfLife`  method under the comment  `TODO: Step 4: Replace return null with logic for getElementsOfLife`.

In the  `getElementsOfLife`  method, do the following:

-   Create a  `String`  `ArrayList`  to store the element string in  `Element`.
-   Use the  `values`  method to get the array of element symbols in  `Element`.
-   Loop through the array of element symbols and add the results from calling  `translateSymbol`  to the  `ArrayList`.  **Note:**  Since you already know all the values in the  `Element`  enum, you could also just return an ArrayList with all the values instead of using a loop. While that is possible, please use a loop instead since that will make the code more reusable if we add in more elements of life later.
-   Return the  `ArrayList`  with the string values for  `Element`

Run  `run-workflow step-04`  in your terminal to validate your work for step 4.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-04`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
