

# Step 5 / Module 8

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.

## Basic requirements

Take a look below at the end state UML diagram for this step:

![Step 5 Class Diagram](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/step_5_class_diagram.png)

Take careful note of the subtle, but important changes from Product`[] products`  to  `ArrayList<Product> products`, a new  `int ID`  field with a getter for it on  `Product,`and the change to the  `Product`constructor. These changes are described in more detail below.

In this step you will make the shop’s ability to contain products more flexible. You know how to work with  `ArrayList`s from module 8. You will convert the array of  `Product`  items in  `Shop`  to an  `ArrayList,`  which will contain  `Product`  items.

First, according to the diagram above, update the  `Shop`  constructor to:

1.  Take in a  `String`  for the name of the  `Shop`, which should be assigned to a  `String name`  private member. Recall from Step 1 that you had to change the name of the shop to  `T-Shirt Mart`  from  `DEFAULT SHOP NAME`. In this step, you are moving the initialization of the shop's name to the  `Shop`  class. Keep in mind that in order for the shop's name to still be accessible from the  `Menu`  class, the private  `String name`  will need a getter. As you see in the UML diagram, you should name that getter  `String getName()`  and return the value of the private member. Use that getter for the output of the name wherever you need it outside the  `Shop`  class.
2.  Take in an  `ArrayList`  of  `Product`  items, rather than an array of  `Product`  items.

Then, you will need to modify the  `Product`  constructor based on the diagram above. It should be able to accept and initialize the  `id`  on  `Product`s.

Update  `ShopRunner`’s  `main`  method to initialize the new  `products`  `ArrayList`  to contain the same products you had in the array of  `Product`  items from the previous step. The ids of each of the products should be the same as the indices of the previously implemented  `product`  array. Since you had 5 products, make sure that your ids are the integers 0 through 4. Pass the  `products`  `ArrayList`  to the  `Shop`class’s constructor.

Now that products are stored in an  `ArrayList,`change how they are printed in the  `Shop`  method’s  `printProducts`  method. Ensure that the products’ prices are still printed, along with their names. Also ensure that the products’ IDs are still printed correctly, so they may still be found in the shop. Use the for-each construct you learned about to iterate over the  `ArrayList`.

Update the  `Shop`’s  `findProduct`  method so that it now searches within the  `ArrayList.`Again, use the for-each construct you learned about to iterate over the  `ArrayList`.

Run  `run-workflow step-05`  in your terminal to validate your work before you move to step 6. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-05`  passes with "BUILD SUCCESSFUL"
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.
