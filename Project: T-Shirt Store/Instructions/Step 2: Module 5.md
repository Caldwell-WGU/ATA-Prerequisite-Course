
# Step 2 / Module 5

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.

## Basic requirements

**REMINDER**: Step 1's tests must continue to pass as you work through Step 2. In other words, as you work on this step, if you break anything from Step 1, those tests will fail. Continue to keep this in mind as you work through the rest of the project. The same will be true for all steps after this step.

Recall that you may always use  `run-workflow run`  or the  **Run**  button, to play with the application as you build it. Sometimes using manual testing is easier than running the automated tests to get an idea of what's missing.

For Step 2, you will implement some more functionality for the T-Shirt store. You will need knowledge from Module 5 of the prerequisites curriculum to do so.

The following is the end state diagram of what you will implement for this step:

![Step 2 Class Diagram](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/step_2_class_diagram.png)

Take note that the  `Menu`  class is where you will be making most of your changes.

The details of the changes are described below.

-   A customer needs to be able to access a list of products
-   A customer may want to search for a specific product

Go ahead and run  `run-workflow step-02`. That should produce output similar to the following:

```shell
ShopRunnerStepTwoIntegrationTest > main_selectListProducts_printsProductsAndExits() FAILED
    org.opentest4j.AssertionFailedError: 
    Mismatch on line 12:
    Expected:[--Products--]
    Actually:[Exiting now. Goodbye.]

    Expected output to look like:

    Hello. Please enter your name:
    Welcome T-Shirt Mart Shopper to T-Shirt Mart

    --Main Menu--
    Select an option using one of the numbers shown

    0: Exit
    1: List Products
    2: Buy Product
    3: Find Product
    4: Show Cart
    5: Checkout
    --Products--
    ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
    ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
    ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
    ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
    ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?

    Actual output was:

    Hello. Please enter your name:
    Welcome T-Shirt Mart Shopper to T-Shirt Mart

    --Main Menu--
    Select an option using one of the numbers shown

    0: Exit
    1: List Products
    2: Buy Product
    3: Find Product
    4: Show Cart
    5: Checkout
    Exiting now. Goodbye.

    Mismatch on line 12:
    Expected:[--Products--]
    Actually:[Exiting now. Goodbye.] 
    ==> expected: <true> but was: <false>

...

```

There will be a lot of other failures, which is why you may see the  `...`  in the example above to be in place of those.

There are a couple of  **VERY IMPORTANT**  things we'd like to mention in the above output:

1.  You will see output like this in most of the test output for the rest of the project:
    
    ```shell
     ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
     ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
     ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
     ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
     ID (\d{1,2}): (.+)(?: - \$(\d{1,2}.\d{1,2}))?
    ```
    
    That's an example of what are called Regular Expressions. You don't need to worry about how to interpret them right now. In this example, those regular expressions just mean that the expected output must contain what looks like this:
    
    ```shell
     ID 0: Crew Neck
     ID 1: V-Neck
     ID 2: Polo
     ID 3: Boat Neck
     ID 4: Tank Top
    ```
    
    For your reference,  `(?: - \$(\d{1,2}.\d{1,2}))?`  means that the test is expecting to see optionally included prices in the product menu. This is for future steps. Don't worry about that right now.
    
2.  As you may see, in Step 2, the big difference is that there's now a requirement to print a menu of products.
    

### Implementation instructions

Create and initialize a  `private String`  array with the name  `products`, which contains the following strings:

```
"Crew Neck", "V-Neck", "Polo", "Boat Neck", "Tank Top"
```

Add a  `private void printProducts`  method in the  `Menu`  class.

In the method, first add a print statement as a label for the products list. The label should be:  `--Products--`

After that, add a for loop that prints each product on a new line. Each line should start with an ID. Use the index of the array as the product ID. The printed product list with its label should look like this:

```
--Products--
ID 0: Crew Neck
ID 1: V-Neck
ID 2: Polo
ID 3: Boat Neck
ID 4: Tank Top
```

Next you will need to add an  `if`  statement to the  `Menu`  class's  `executeMenu()`  method, adding functionality to let the user make more choices. Use the helper method we've provided to you  `getNextIntFromUser()`  to collect the menu option that the user selects. The  `if`  statement should be written between the printing of the menu (`printMenu()`  statement) and the termination of the application (`exit()`  statement).

If the shopper selects option 1 from the menu, write a method call to  `printProducts`.

Go ahead and run the workflow with  `run-workflow step-02`  one more time. You should now see one less failure. The remaining failures have to do with needing to add the functionality of finding a product. Similar to how we implemented printing products we will implement a method to add the functionality, and then we will update the main menu to use the new method.

Add  `findProduct`  method that has a  `String`  `searchText`  param and returns an  `int`. In this method add a for loop to iterate through  `products`. It should use an  `if`  statement to check whether  `searchText`  is the same as the name of current product, and if so return the index of the found product. When a product isn't found return  `-1`.

If the shopper selects option 3 from the menu, prompt the user for the name of the product with the following text:  `Enter the item to search for:`

We have provided a private helper method for you to call to get the next line of user input. The method is called  `getNextStringLineFromUser()`. Call the method and pass its return value to a local  `String`  variable, such as  `itemToFind`, like so:

```
String itemToFind = getNextStringLineFromUser();
```

Call the  `findProduct`  method you created above and pass it  `itemToFind`  as the argument. Use the return value of the method to print the name of the item and its product id, which is the index returned from  `itemToFind`. Here’s an example of a found Crew Neck, which was at index  `0`  in the  `products`  array.:

```
Crew Neck was found and its product id is 0
```

When a product could not be found -  `findProduct`  returned  `-1`print the following:

```
That product was not found.
```

After that, you have just one more thing to worry about...

**IMPORTANT DETAILS - READ CAREFULLY:**  The menu should be reprinted after every interaction,  **except exiting**. So, after listing products, or searching for a product, make sure to reprint the menu, so that the shopper may always be aware of what selections are available to them.

**If you don't do this, your tests will continue to fail.**

**Recommendations:**

-   The easiest thing to do at this point is to add another  `printMenu()`  method call right before  `exit()`  in  `executeMenu()`.
-   But,  **make sure you do NOT**  print the menu if the user chooses to exit (choice 0), otherwise the tests will still fail.
    -   For example, you might add an  `else if`  to handle choice 0 differently.
-   Think about how to implement this correctly. It's a little tricky, but we know you got this.

Run  `run-workflow step-02`  in your terminal to validate your work before you move to step 3. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"
-   You have committed your work and pushed your code -  **this is your last reminder to do so, you'll need to do it in all future steps!**
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.
