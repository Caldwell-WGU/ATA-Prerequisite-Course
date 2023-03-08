Creating classes from UML Diagrams

Introduction to creating classes from UML diagrams

At your job, your boss gives you a new programming assignment. This assignment will be with a video game development company that is making a racing game. The company already has an idea of what the game should be like, so you only need to help them create a couple of classes based off UML diagrams the company provides you.

In this activity, you will be using UML diagrams to create new classes.

Also in this activity, a class called Printer will be provided for you to use.

Step 1 of creating classes from UML diagrams

Create the structure of the Car class based on the following UML diagram.

![alt "Car UML Diagram"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/car_diagram.png)

In this UML diagram

There are three private attributes of type String called color, make, and model.
There is another private attribute of a custom Printer type called printer.
It has a constructor that takes in three String parameters. While not shown, the constructor should order the parameter in this order: color, make, model.
It has three public getter methods for the attributes.
It has two other public methods to start and stop the car.
An empty Car class has been provided for you in work/src/main/java/com/ata/Car.java. Please add the attributes, constructor, and methods to that class under the corresponding TODO comments.

Run run-workflow step-01 in your terminal to validate your work for step 1 before moving on to the next step.

Step 2 of creating classes from UML diagrams

Now that we have created the structure, for the Car class, let's implement the constructor and methods.

Implement the constructor by setting each parameter value to its corresponding attribute (i.e., color parameter set to color attribute, etc) and initializing the printer attribute to a new instance of the Printer class.
Run run-workflow step-02.1 in your terminal to validate your work for step 2.1 before moving on to the next step.

Implement the getter methods by returning their respective private attribute. Note that if you already did this in the first step, you are ahead of the game.
Run run-workflow step-02.2 in your terminal to validate your work for step 2.2 before moving on to the next step.

Implement the start and stop methods by
Calling the printer object's print method with the String Starting and the attributes color, make, model for the start method.
Calling the printer object's print method with the String Stopping and the attributes color, make, model for the stop method.
Run run-workflow step-02.3 in your terminal to validate your work for step 2.3 before moving on to the next step.

If all tests for the steps are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-02.1, run-workflow step-02.2, and run-workflow step-02.3 passes with "BUILD SUCCESSFUL"
Step 3 of creating classes from UML diagrams

What good is a game that doesn't have a player? In this step you will be creating the Player class based off another UML diagram.

Create the structure of the Player class based on the following UML diagram.

![alt "Player UML Diagram"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/player_diagram.png)

In this UML diagram

There is one private attribute of type Car called car.
It has a constructor that takes in a Car object as its parameter.
It has two methods to start and stop the game.
An empty Player class has been provided for you in work/src/main/java/com/ata/Player.java. Please add the attributes, constructor, and methods to that class under the corresponding TODO comments.

Run run-workflow step-03 in your terminal to validate your work for step 3 before moving on to the next step.

Step 4 of creating classes from UML diagrams

Now that we have created the structure, for the Player class, let's implement the constructor and methods.

Implement the constructor by setting the passed in parameter for the constructor to the car attribute.
Run run-workflow step-04.1 in your terminal to validate your work for step 4.1 before moving on to the next step.

Implement the startGame method by calling the start method of the car object.
Run run-workflow step-04.2 in your terminal to validate your work for step 4.2 before moving on to the next step.

Implement the stopGame method by calling the stop method of the car object.
Run run-workflow step-04.3 in your terminal to validate your work for step 4.3 before moving on to the next step.

If all tests for the steps are passing you will see BUILD SUCCESSFUL in your terminal window. If tests are failing you will see BUILD FAILED with the failing tests along with their messages in the output above.

You have completed this step when:

run-workflow step-04.1, run-workflow step-04.2, and run-workflow step-04.3 passes with "BUILD SUCCESSFUL"
Submitting your work

You can ensure all tests pass before submitting by clicking the Build button. You will see BUILD SUCCESSFUL in your terminal. If tests are failing you will see BUILD FAILED with the failing test output above.

You may also run run-workflow test-all to validate all steps are passing.

Click the Submit button to submit your work and review your grade.
