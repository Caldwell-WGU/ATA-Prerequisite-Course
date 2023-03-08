ArrayLists and For-each loops

Introduction to ArrayLists and for-each loops.

You got another new project. This time this project will be to create a TODO app for your client.

In this activity, you will be working with ArrayList and using for-each loops. Recall that to use certain classes like Arrays and ArrayList, you will need to import the classes from java.util first.

import java.util.ArrayList;
import java.util.Arrays;
If you do not import these packages first, you will see a cannot find symbol error.

Also recall the methods used to modify an ArrayList.

// create ArrayList with default value
ArrayList<dataType> variableName = new ArrayList<>(Arrays.asList(comma_separated_values));

// adding to ArrayList
variableName.add(value);

// getting the size of ArrayList
variableName.size();

// removing from ArrayList
variableName.remove(index);
variableName.remove(value);

// changing existing value
variableName.set(index, value);
Lastly recall the syntax for using a for-each loop

for (DataType variableName : list) {
// body of loop
}
Below you will find the class diagram for the ToDoList class.

![alt "Todo List UML Diagram"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/todolist_diagram.png)

All work will be done in the ToDoList class located at work/src/main/java/com/ata/ToDoList.java.

Step 1 of ArrayLists and for-each loops

The first thing we need to do for the TodoList class is to declare the attributes and create the constructor.

Under the comment TODO: Declare attributes below

Declare a private ArrayList to hold strings called todoList.
Declare a private TodoListHelper class called todoListHelper. This class is provided for you in asnlib/public/src/main/java/com/ata/TodoListHelper.java
Under the comment TODO: Create constructor below

Create a constructor that takes in a String as a parameter for the first item in your todoList. Your constructor should do the following:
Assign the todoList to a new ArrayList with the passed in parameter as the first element.
Assign the todoListHelper to a new instance of the TodoListHelper class.
Run run-workflow step-01 in your terminal to validate your work for step 1.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-01 passes with "BUILD SUCCESSFUL"
Step 2 of ArrayLists and for-each loops

Now that we have the list, we’ll need to be able to add items to it.

Under the comment TODO: Create addItem method below
Create method addItem that takes in a String as an argument that will do the following:
Call the add method of the todoList to add the new item to the ArrayList.
Return todoList.
Run run-workflow step-02 in your terminal to validate your work for step 2.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-02 passes with "BUILD SUCCESSFUL"
Step 3 of ArrayLists and for-each loops

We want to be able to get some basic information about the todoList. We may want to know the number of items in the todoList and be able to view the todoList in an user-friendly format.

Under the comment TODO: create getNumberOfItems below

Create method getNumberOfItems that does the following:
Call the size method of todoList to return the size of the list.
Under the comment TODO: create printTodo below

Create method printTodo that does the following:
Loop through each item in todoList (should use for-each).
Within the loop, call the printSpecial method of todoListHelper and pass in the current item of the loop as a parameter.
Run run-workflow step-03 in your terminal to validate your work for step 3.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-03 passes with "BUILD SUCCESSFUL"
Step 4 of ArrayLists and for-each loops

A todo list will not be very helpful if you can’t remove items from the list.

Under the comment TODO: create removeItem below
Create method removeItem that takes in an int as an argument that represents the index of the item to remove from todoList. The method should do the following:
Call the remove method of the todoList and pass in the int as a parameter to remove the item at that index.
Return todoList.
Run run-workflow step-04 in your terminal to validate your work for step 4.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-04 passes with "BUILD SUCCESSFUL"
Step 5 of ArrayLists and for-each loops

The last thing we will be doing will be adding a method to change items in the list.

Under the comment TODO: Create changeItem below
Create method changeItem that takes in an int as the first argument to represent the index of the item to change and a String as the second argument to represent the updated todo item. The method should do the following:
Call the set method of todoList to change the value of the ArrayList.
Return todoList.
Run run-workflow step-05 in your terminal to validate your work for step 5.

If all tests for the step are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-05 passes with "BUILD SUCCESSFUL"
Submitting your work

You can ensure all tests pass before submitting by clicking the Build button. You will see BUILD SUCCESSFUL in your terminal. If tests are failing you will see BUILD FAILED with the failing test output above.

You may also run run-workflow test-all to validate all steps are passing.

Click the Submit button to submit your work and review your grade.
