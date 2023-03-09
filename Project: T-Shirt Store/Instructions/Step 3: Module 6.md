
# Step 3 / Module 6

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.

## Basic requirements

The first thing to notice about this step, is that we have not provided test output. It's going to be up to you to run the workflow for this step to read and interpret test output. This is the first way the training wheels are coming off for this project.

For Step 3, you will implement some more functionality for the T-Shirt store. You will need knowledge from Module 6 of the prerequisites curriculum to do so.

As you learned in Module 6, it is useful to create classes to represent entities in your application, when they are not yet represented by any of the existing primitive types or classes.

In this case, the  `Menu`  class has the list of products in the shop. With the knowledge you have this may raise some questions in your mind about what should handle the responsibility of maintaining this information. You would be right, if you thought the private member  `products`  should probably be extracted from the  `Menu`  class. It should exist in a separate class  `Shop`  so that  `Shop`  may worry about how products are printed and found. Then, the  `Menu`  would not concern itself with the specifics of its products, how to print products, how to find products in the shop - that would all be up to the  `Shop.`  The  `Menu`  would then just have a  `Shop`  member, and tell it when it needs it to do something.

Let’s work on that. Take a look at the UML class diagram for the end state you’ll have after you complete this step:

![Step 3 Class Diagram](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/step_3_class_diagram.png)

### Implementation instructions

Take note that a new  `Shop`  class is added and that certain members of the  `Menu`  are moved to it. The details are described below. Your next step is to create a  `Shop`  class in the file  `Shop.java`  in the  `work/src/main/java/com/ata`  directory. It should have 1 public member:

-   a  `String`  array of products

Add a constructor, which takes one argument:

-   an array of  `String`  objects to represent the products that should be in the shop

**NOTE:**  This constructor should copy the contents of the passed in  `String[]`  to the  `products`  member. A quick way to do this is to invoke the passed in  `String[]`  array's  `clone()`  method and assign the result of that method invocation to the  `products`  member.

Move the functionality of the  `Menu`’s  `printProducts`  method to the  `Shop`  class. The  `Menu`  shouldn’t concern itself with how to print products any longer.

Move the functionality of the  `Menu`’s  `findProduct`  method to the  `Shop`  class. The  `Menu`  shouldn’t concern itself with how to find products any longer.

Doing the above will break the  `Menu`  class temporarily, but not to worry, you'll address that momentarily.

You will now need to have the  `Menu`  know about and interact with a  `Shop.`  In the  `Menu`  class, add a private member for  `Shop`.

Update the  `Menu`  class’s constructor to take a  `Shop`  as an additional parameter, and in the  `Menu`  constructor, make sure to assign the passed in  `Shop`  to the private  `Shop`  member you created above.

Initialize a new  `Shop`  in the  `ShopRunner`  class’s  `main`  method, passing it the array of products it had  `{ "Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top" }`. Pass this  `Shop`  to the  `Menu`  constructor in the  `ShopRunner`'s  `main`method to initialize. Remove the  `products`  array from the  `Menu`, since the  `Menu`  no longer manages  `products`.

Update the method calls to  `printProducts`  and  `findProducts`  in the  `Menu`  class to be called on the  `Shop`  member.

Run  `run-workflow step-03`  in your terminal to validate your work before you move to step 4. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.
