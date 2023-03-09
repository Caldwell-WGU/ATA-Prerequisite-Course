
# Step 6 / Module 8, continued

You may go back to the  [Main Prereqs Project Instructions](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/README.md)  at any time.

## Basic requirements

For Step 6, you will implement some more functionality for the T-Shirt store. You will again need knowledge from Module 8 of the prerequisites curriculum to do so.

Up until this step the shopper was only able to do one thing at a time in the shop, by selecting one of the options from the shop’s menu, and then the shop application would terminate. That hasn’t been a great experience for shoppers.

With the lessons learned from Module 8, though, you can make it better! Wrap the code in the  `Menu`’s  `executeMenu`  method with a  `while`  loop so that all options in the menu selected by the shopper, except option 0, which is used to exit the application, will allow the shopper to continue making more selections. When the shopper selects option 0, the application should terminate. Think about what this means for how you need to construct the  `while`  loop and what condition you need to check in order to have the application terminate when the shopper selects option 0.

Run  `run-workflow step-06`  in your terminal to validate your work before you move to step 6. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-06`  passes with "BUILD SUCCESSFUL"
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/README.md)  at any time.
