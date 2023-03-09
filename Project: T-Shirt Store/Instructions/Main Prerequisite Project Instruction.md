
# Prereqs Project Instructions

## Introduction

For this project you will build a T-Shirt Storefront. The T-Shirt Storefront will have a Command Line Interface (CLI). A shopper will be able to list available t-shirts, view and search t-shirts, add t-shirts to their cart, see their cart, and check out. Unfortunately you won't be collecting and making any money in this project. Transactions will be simulated.

Recall knowledge gained from  **_Module 3 Topic 1_**  of the course to remember how a CLI works.

Take a look at  [the screencast](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/assets/prereqs-project-solution-screencast.mp4)  for a demo of what the working storefront should look like.

Throughout the project you will expand the starter code to include many Java classes that you design and build. You can take a look at the UML diagram below to see the classes you will eventually build to make the Storefront. This will be a helpful diagram to refer back to as you work on the project.

![End State Class Diagram](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/end_state_class_diagram.png)

**Here’s a reference for how to read the above diagram:**

Each box represents a class that you will create, update, or use. The diagram represents the end state of the code you will implement over a series of 9 steps. The diagram shows that there will be 5 classes and one enum:

-   `ShopRunner`
-   `Menu`
-   `Shop`
-   `Cart`
-   `Product`
-   `MenuOption`  enum

You'll see other classes referenced in the diagram, like  `Scanner`  and  `ArrayList`. They exist in the Java library for you to use.

Here are the relationships you’ll eventually have between your classes:

-   `Menu`  has a  `Cart`
-   `Menu`  has a  `Shop`
-   `Menu`  has a  `Scanner`
-   `Shop`  has an  `ArrayList`  of  `Products`
-   `Cart`  has an  `ArrayList`  of  `Products`

A bit more info about the diagram:

-   Unfilled red squares next to class members indicate  `private`  class members.
-   Filled red squares next to class members indicate suggested  `private`  class methods.
-   Filled in green circles next to class members indicate  `public`  class methods.
-   Underlined method in the enum is a  `public static`  class method.
-   You may add private methods that aren't in the diagram, as necessary.

If any of the above doesn’t make sense yet, don’t worry, because you’ll learn about it as you go through the prereqs curriculum. Come back to these instructions as you go, and you'll see your knowledge bank fill.

**_You'll start off in Step 0 and Step 1 with a lot of detailed instructions_**. The instructions will become a bit more vague as you go along. Think of this as taking off the training wheels as you work through the curriculum and continue to work on the project.

**_We recommend you pay extra close attention in the Step 0 and Step 1 instructions, because they demonstrate patterns you'll need to be very familiar with for the rest of the steps._**

**There are times when instructions will still be very specific, mostly when it comes to naming. From time to time we might require you to name a method a specific way. This is to make sure we can check that your code is working and provide you feedback.**

## Vocareum project structure

When you first visit the project you will see in the terminal that we have initialized a git repository for you. You will be pushing code to this repository as you proceed through the project, starting with Step 0. Recall lessons learned in  **_Module 3 Topic 2_**  for the needed git knowledge.

![Git Repo Initialization](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/git_init.png)

We have set you up with some initial starter code. All the starter code is located in the  `work/local/src/main/java/com/ata`  directory. You may browse to that using the file browser on the left-hand-side of the activity.

![Starter Code Folder](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/starter_code_src.png)

For Step 0, you’ll interact with the  `resources`  directory to create a file in it. Otherwise, for all other steps, you’ll work in  `work/local/src/main/java/com/ata`. The  `resources`  directory contains non-code files, whereas  `work/local/src/main/java/com/ata`  contains all the code.

Though you won’t learn about testing your code in the prerequisites course, you may still be curious how we grade your code. There’s a directory that contains all the tests we use to help us generate a grade. If any of your steps’ tests fail, and you’d like to look at the tests themselves, they are in the  `resource/asnlib/public/src/readonly-integrationTest`  directory. If you look in that directory, you’ll see that the tests are organized into folders by the steps for which those tests were written.

**_Important:_**  These are not editable by you, nor should you really worry about the details in them. We are just letting you know, in case you find yourself wondering.

![Read Only Tests Folder](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/starter_code_read_only_tests.png)

## Grading

**Each successfully completed Step below will receive 1 point. Because there are 9 total steps if you count Step 0 through Step 8, your successful completion of the entire project will get you 10 points.**

After you submit the project by clicking the  **“Submit”**  button in Vocareum, you will be able to retrieve your grade by clicking the  **“Grades”**  button or more information about why a certain grade was "0/1" in the grade report by clicking the  **"Grade Report"**  button. The grade report will give you hints about how to investigate a particular failure. Keep in mind that you will not see any output in the terminal after clicking  **"Submit"**. Open the  **"Grading Report"**  or  **"Grades"**  by clicking the button in the Vocareum interface to see your grade after any submission. In the event that the "Code Compiles" section receives a "0/1" grade, you'll need to fix compilation errors or syntax errors and resubmit. In the event that a particular Step gets a "0/1" grade, it means you have failing tests for that step. In that case, go back and fix the test failures and resubmit, so you may receive a "1/1" grade for that step.

When you first start the project, you will see output that looks like this when you click “**Grades”:**

![Grading](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/grading.png)

-   Code Compiles - your code  **must**  compile for any other steps to be graded. When your code doesn't compile you'll see errors in the terminal letting you know about them. You'll need to think about how to resolve them.

As you complete steps 0 - 8, you may re-submit the project to get a better grade.

**__Although you may elect to complete the entire project in one shot, we do not recommend doing this. The steps below are iterative. They help you build one set of requirements from one step to the next. We highly recommend you go one step at a time, following the instructions very closely for success.__**

**VERY IMPORTANT NOTE 1:**  As you go through the steps, prior steps' tests must continue to pass.

**VERY IMPORTANT NOTE 2:**  You will only receive grades for code that you commit and push to the git repository. Please be sure to commit and push code for each step before submitting your project for grading.

## Workflow Summary for All Steps

As you complete the following steps in order, you should follow a very systematic workflow:

1.  Read instructions carefully and understand how to approach that step
2.  Follow the instructions and make code changes to satisfy the requirements of that step
3.  Run step's tests using  `run-workflow`  to validate they pass
4.  Once your workflow is passing:
    -   stage, commit, and push your changes to the remote repository - we'll explain this in Step 0
    -   submit code (click the Submit button or use  `run-workflow run`  command)
    -   verify grade -  **if you don't receive a grade, this could mean:**
        -   an earlier step isn't passing
        -   code isn't compiling
        -   you didn't push your code to the remote git repository

Following are the steps you'll need to take to complete the project. Start with Step 0 by clicking on it. Come back to this after every step and click onto the next step in order to continue.

## [Step 0 / Module 3](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%200:%20Module%203.md)

## [Step 1 / Modules 1-4](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%201:%20Modules%201-4.md)

## [Step 2 / Module 5](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%202:%20Module%205.md)

## [Step 3 / Module 6](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%203:%20Module%206.md)

## [Step 4 / Module 7](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%204:%20Module%207.md)

## [Step 5 / Module 8](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%205:%20Module%208.md)

## [Step 6 / Module 8, continued](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%206:%20Module%208.md)

## [Step 7 / Modules 7-9](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%207:%20Modules%207-9.md)

## [Step 8 / Modules 9-10](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Step%208:%20Modules%209-10.md)
