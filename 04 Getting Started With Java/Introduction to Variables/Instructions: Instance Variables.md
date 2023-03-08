# Instance Variables

Declaring, Initializing, and Working with Instance Variables

## Introduction to Instance Variables

You have been asked to build an application that will help manage recipes. This activity will have you define some data that could represent a specific recipe. You will declare, initialize, and work with variables to store data.

-   Recall the basic syntax used for variables:  **dataType variableName = value;**
    
-   Recall any special syntax for variable values of certain data types.
    
-   Remember that statements must end with a semicolon(;)
    

All code implementation for this activity should be done within the Recipe class:  `src/main/java/com/ata/Recipe.java`

## Step 1 of Instance Variables - Reference Types

Every recipe should have a descriptive title that tells what dish it will help a user make.

1.  Declare a  `String`  type variable named  `title`  and initialize it with a value of  `French Toast`.

It's also important to keep a list of ingredients used in the recipe so users can make sure they have items needed before starting to make the dish.

2.  Create a  `String`  array called  `ingredients`. Assign the array elements as each ingredient in the order here. The values should be  `bread`,  `milk`,  `eggs`,  `butter`,  `sugar`, and  `cinnamon`.

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Instance Variables - Primitive Types

Multiple recipes can have the same title so there needs to be a way to tell them apart from one another. Add a unique identifier for each recipe.

1.  Declare a  `long`  variable named  `id`  and set the value to  `2345678901L`.

How complex a recipe is can determine if a user wants to try and use it. Provide some information about the number of ingredients required, which will be an integer value.

2.  Create an  `int`  variable named  `numberOfIngredients`  but do not initialize it.

Most people want to know how many servings a recipe will make so they can adjust it according to their needs. Servings for recipes can be a decimal value.

3.  Make a variable named  `servings`  that is the  `double`  data type and assign it a value of  `4.5`.

Often people like to see how others liked a recipe before deciding to follow it. This recipe will use a letter grade rating scale.

4.  Declare a variable named  `rating`  of  `char`  type and assign it the value  `B`.

Some users may have dietary restrictions and more information about the ingredients can be helpful to them.

5.  Create a  `boolean`  variable with the name  `isDairyFree`  and set its value to  `false`.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of Instance Variables - Working with Variables

1.  Find the  `initializeVariable`  method and assign the  `numberOfIngredients`  variable a value that is the size of the ingredients array using the  `.length`property.  **HINT**  - Check that you're using  `.length`  in your implementation! If you do not use the  `.length`  property, the tests will fail with the following error message:
    
    ```console
     The initializeVariable method did not use the length property to set the value
     of the numberOfIngredients variable ==> expected: <10> but was <6>
    ```
    
2.  In the  `printVariable`  method use the provided print statement to display the recipe  `title`.
    
3.  Locate the  `updateVariable`  method and within it change the ingredient  `cinnamon`  to  `nutmeg`  in the  `ingredients`  array. Access the array element using the proper index to set the new value.
    

Run  `run-workflow step-03`  in your terminal to validate your work for step 3.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
