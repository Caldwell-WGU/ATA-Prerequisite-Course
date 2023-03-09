
# Step 7 / Modules 7-9

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.

## Basic requirements

For Step 7, you will implement some more functionality for the T-Shirt store. You will need knowledge from Modules 7-9 of the prerequisites curriculum to do so.

Take a look below at the end state UML diagram for this step:

![ "Step 7 Class Diagram"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/step_7_class_diagram.png)

What’s a shop without a shopping cart? In this step you will implement a  `Cart`  class and make it work with the rest of the application. When a shopper selects option 2 from the menu, items in the shop should be added to the  `Cart`.

When the shopper selects option 2, they should be prompted with the ID of the item they want to purchase.

The prompt should be:

```
Please enter the ID of the product you would like to purchase:
```

If the shopper enters a valid product ID and presses enter, that product should be added to the cart’s  `ArrayList`  of  `items`.

If the shopper enters a valid ID when adding the item to the cart, the item should be added to the  `ArrayList`  of  `items`  in the Cart and the  `total`  in the cart should be updated. The shopper should see the following message printed, confirming the item has been added to the cart, in this case for a V-Neck:

```
V-Neck has been added to your cart.
```

If they enter an invalid ID the following message should be printed and neither the  `items`  nor the  `total`  should be updated:

```
That item ID is invalid and could not be added to the cart.
```

The internal cart  `total`  should be updated based on the calculated sum total of the prices of the items in the cart. Because  `items is`  a private member of the  `Cart`  class, you need to implement a public  `addItem`  method to update the  `items`.

The  `Cart`  class also needs to have a private member containing the tax rate. Keep in mind that you’ll need to calculate the total in the cart with the tax rate applied.

In addition, you’ll need to create a public method called  `showDetails.`It should be called when the shopper selects option 4 in the menu and should print the total pre-tax cost of all the items in the cart and the cart items themselves. It should also display the after tax cost on a separate line. Here is what the printout should look like, when it contains just a V-Neck:

```
--Cart--
Item Count: 1
Items: 
V-Neck: $20.00

Pre-Tax Total: $20.00
Post-Tax Total (10.00% Tax): $21.60
```

When the cart contains multiple items, here is what that should look like:

```
--Cart--
Item Count: 2
Items: 
V-Neck: $20.00
Polo: $25.50

Pre-Tax Total: $45.50
Post-Tax Total (10.00% Tax): $49.14
```

Take careful note of the formatting. You’ll want to use  `String.format`  to produce the output above.

If the cart is empty and shopper selects option 4, print the following message:

```
The cart is empty. Please add at least one product to see it in the cart.
```

You also need to implement two additional pieces of functionality for the  `Cart`: emptying it and checking out. Each of those methods are shown in the diagram.

Finally, you’ll need to add some functionality to allow the shopper to check out. Checkout should occur when the shopper selects option 5 in the menu. Checking out should empty the cart using a private  `empty`  method that you need to define on the  `Cart`  class to clear the  `items`  `ArrayList`  in the  `Cart`. Finally, to confirm checkout, the following should be printed by the application:

```
Your total is $95.25
Thank you for shopping at T-Shirt Mart.
```

The total should use the  `String.format`  method to display the value.

When the cart is empty, the following message should be displayed if the shopper attempts to check out:

```
Your cart is currently empty. Please add at least one product to check out.
```

Run  `run-workflow step-07`  in your terminal to validate your work before you move to step 6. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-07`  passes with "BUILD SUCCESSFUL"
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Project:%20T-Shirt%20Store/Instructions/Main%20Prerequisite%20Project%20Instruction.md)  at any time.
