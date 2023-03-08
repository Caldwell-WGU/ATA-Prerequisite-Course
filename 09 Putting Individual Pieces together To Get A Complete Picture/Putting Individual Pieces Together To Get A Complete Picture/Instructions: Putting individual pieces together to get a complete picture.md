
# Putting individual pieces together to get a complete picture

## Introduction

All coding for this activity should be done within the StringFormatUtil class:  `src/main/java/com/ata/StringFormatUtil.java`

This activity will have you add functionality to methods within a utility class that assists in formatting string values.

**Recall String.format() syntax:**

`String.format([formatString], [values...])`

**Recall Format Specifier syntax:**

`% [argumentIndex$] [flags] [width] [.precision] conversion`

**Remember that statements must end with a semicolon(;)**

## Step 1 of Putting individual pieces together to get a complete picture

Implement the functionality of the  `formatPriceLine`  method which helps with aligning prices. A  `price`parameter of double type can be sent into the method and a string will be returned with formatting for a price line. The string should start with a  **$**  (dollar sign), it should have a width of  **10**, and have  **2**  decimal places.

**Example Method Calls:**

`formatPriceLine(8.0);`  
`formatPriceLine(11.63);`  
`formatPriceLine(.99);`  
`formatPriceLine(12);`  
`formatPriceLine(4.57);`

**Expected Return Values:**

$      8.00
$     11.63
$      0.99
$     12.00
$      4.57

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of Putting individual pieces together to get a complete picture

Implement the  `formatLabeledValue`  method functionality to display a label above a value alongside the formatted value. The returned string should have the String type  `label`  parameter followed by a colon on the first line. The second line should have the int type parameter  `value`  just as it received. This should be followed by a value separator  **->** with a space on both sides of it. Lastly the value should be shown again but with a  **+**  for positive values and wrap negative values in parenthesis. Use commas as the thousands separator. Recall that an argument index or  **<**  flag can be used to apply the same argument to multiple format specifiers.

**Example Method Calls:**

`formatLabeledValue("Profit", 123456);`  
`formatLabeledValue("Deficit", -9870);`

**Expected Return Values:**

Profit:
123456 -> +123,456
Deficit:
-9870 -> (9,870)

Run  `run-workflow step-02`  in your terminal to validate your work for step 2.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Running the Code

You can run the code to interact with the methods you are implementing by clicking the  **Run**  button. You will see the output in the terminal. If the implementations are correct, you should see output with the expected return values from above.

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
