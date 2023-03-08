
# Break Statements

## Introduction to Break Statements

As an aspiring new programmer who has done a great job on the previous projects, your boss assigned you with a new project for his friend Mateo.

For this activity, you will be applying break statements to for loops to create software that will perform quality check on the results that a machine creates. Specifically, you will be creating a method for the software.

Recall the syntax for a for loop

```
for (initialExpression; testExpression; updateExpression) {
    // body of for loop
}
```

and the syntax for the break statement  `break;`

Recall that generally you will use breaks when a certain conditional statement is met within a for loop like so

```
for (initialExpression; testExpression; updateExpression) {
    if (condition) { 
        break;
    }
}
```

## Step 1 of Break Statements

Mateo is a food scientist that works for a company that creates fruit punch. His job at the company is to check the sugar content in grams in fruit punch that a machine creates. To do this, Mateo needs to look at a list of numbers that the machine outputs that represent the sugar content each of the fruit punch in a batch of fruit punch. He needs to make sure that all the sugar content in the batch of fruit punch is not at or above a threshold that is provided to him. If any of the fruit punch is at or above the threshold, the whole batch must be remade and readjust the machine. To readjust the machine, he needs to know the average sugar content just before the threshold for sugar content for the fruit punch. Normally this would be a job that is done by hand but Mateo knows that this is error prone, so he decides to have a program created that will do this for him. Your boss gave this project to you to work on. Here are the specs for the program.

All work should be done in the QualityChecker class:  `work/src/main/java/com/ata/QualityChecker`under the TODO.

1.  Create a method called  `qcMachine`.
2.  Have the method take in two arguments: A  `double`  array called  `sugarContents`  that represents a list of sugar contents the machine creates, and a double called  `threshold`  that represents the threshold.
3.  Returns a  `double`  that will be the average of the sugar content before a threshold not including the value at the threshold.

Within the method it should do the following: 4. Create two variables used to get the average:

-   An  `int`  variable  `count`  to keep track of the number of items.
-   A  `double`  variable  `sum`  to keep track of the sugar content.

5.  Loop through the list of sugar contents and within the loop:
    -   Create a local variable of type  `double`  called  `sugarContent`  to store the sugar content at the current index.
    -   Add a conditional to check if  `sugarContent`  is greater than or equal to  `threshold`  and break out of the for loop if it is.
    -   After the conditional, increment  `count`  by 1 and add  `sugarContent`  to sum.
6.  After the for loop, create a conditional that:
    -   Check to see if  `count`  is 0, and return 0 if it is since you can't divide by 0.
    -   Otherwise, return the average sugar content by dividing  `sum`  by  `count`  (`sum / count`).

Your manager, taking into consideration that this project could be challenging, provided you with the pseudocode of how he thinks this method should be created.

```
method qcMachine(sugarContents, threshold):
    set count = 0
    set sum = 0.0
    for set i = 0 to length sugarContents increment by 1: 
        set sugarContent = sugarContents[i]
        if sugarContent >= threshold:
            break
        endif
        count = count + 1
        sum = sum + concentration 
    endfor
    if count == 0:
        return 0
    else 
        return sum / count
    endif
endmethod

```

Run  `run-workflow step-01`  in your terminal to validate your work for step 1.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Break Statements

Before Mateo commissioned you for this program, he commissioned another programmer to create another program to deal with a quirk in another machine. This quirk in the machine causes the sugar content to be multiplied by 10.

The programmer was able to fix the quirk but had to leave in a hurry, so he made a mistake in the program. Mateo would like you to troubleshoot the issue and see if you can fix the program.

The previous programmer's code is in the class QualityCheckerTroubleshoot:`work/src/main/java/com/ata/QualityCheckerTroubleshoot`

In the  `QualityCheckerTroubleshoot`  class, there is a main method that can be run to test out the  `qcMachineQuirk`  method. You can update  `sugarContents`  and  `threshold`  to include any values you want to test out. Once you have added values you want to test, click on the  **Run**  button to test out your values and changes. You will see the text  **Average Sugar Content:**  follow by the average.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
