
# Step 1 / Modules 1-4

You may go back to the  [Main Prereqs Project Instructions](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/README.md)  at any time.

## Basic requirements

For Step 1, you will implement some initial functionality for the T-Shirt store. You will need knowledge from Modules 1-4 of the prerequisites curriculum to do so. The first thing you’ll build will be the store’s greeting and main menu.

When the application first starts, the store should greet and prompt the shopper for their name as follows:

`Hello. Please enter your name:`

After the shopper types in their name, for example  `ATA Shopper`, they should be greeted with the following:

`Welcome ATA Shopper to T-Shirt Mart`

After that, the main shop menu should be displayed, and look like this:

```
--Main Menu--
Select an option using one of the numbers shown

0: Exit
1: List Products
2: Buy Product
3: Find Product
4: Show Cart
5: Checkout
```

From here, the shopper should be able to select any of the 6 options displayed to them. For this first step, you will not build any of the functionality associated with options numbered 1-5, and instead will just print text to confirm their selection.

For example, if the shopper picks option  `1: List Products`, the following would be printed to the console:

`Option 1 was selected. Not yet implemented.`

After any of the options 1 - 5 are selected, and the text has been printed to confirm the shopper's selection, the application should terminate. Note that this doesn't mean it should print anything extra to the terminal. It just means the application should close.

You do need to let the shopper know that the application is exiting though, if the shopper selects option 0. When the shopper selects  `0: Exit`, they should see the following message and then the application should close:

`Exiting now. Goodbye.`

Here’s what a full set of interactions should look like for this step from the perspective of the shopper when the shopper enters  `0`  to exit:

```
Hello. Please enter your name:
ATA Shopper
Welcome ATA Shopper to T-Shirt Mart

--Main Menu--
Select an option using one of the numbers shown

0: Exit
1: List Products
2: Buy Product
3: Find Product
4: Show Cart
5: Checkout
0
Exiting now. Goodbye.
```

When any other choice is selected, here's what the shopper should see instead, in this case entering  `1`  for the menu selection:

```
Hello. Please enter your name:
ATA Shopper
Welcome ATA Shopper to T-Shirt Mart

--Main Menu--
Select an option using one of the numbers shown

0: Exit
1: List Products
2: Buy Product
3: Find Product
4: Show Cart
5: Checkout
1
Option 1 was selected. Not yet implemented.
```

### Step implementation instructions

First, take a look at the UML class diagram for the starting state of code in Step 1 below:

![Step 1 Class Diagram](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/step_1_class_diagram.png)

You may immediately see that you’re going to start out with just the following two classes:

-   `ShopRunner`  - provided to you in  `work/src/main/java/com/ata/ShopRunner.java`
-   `Menu`  - provided to you in  `work/src/main/java/com/ata/Menu.java`

The code you write for Step 1 should only be added to the  `Menu.java`  class and no new classes need to be created.

Take a moment and see what parts of the final class diagram you will implement in this step. You may always refer to the final class diagram at the top of the  [Main Prereqs Project Instructions](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/README.md), but here it is again, for your reference:![End State Class Diagram](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/assets/end_state_class_diagram.png "End State Class Diagram")

Take a look at what's inside the two provided classes:

-   The  `Menu`  class contains:
    -   an  `executeMenu`  method
    -   a  `greet`  method
    -   a  `private`  `printMenu`  method
    -   a  `private`  `exit`  method
    -   a  `private`  `int getNextIntFromUser`  method
    -   a  `private`  `String`  `getNextStringLineFromUser`  method
    -   two members: an empty  `String`  array of  `menuOptions`, and a  `Scanner`.
    -   **NOTE: don’t worry about why some methods are  `private`  and some are  `public`  for now. You will learn about access modifiers in a future module, but know you’ll have to update some  `private`  methods.
-   The  `ShopRunner`  class contains a  `main`  method.
    -   The  `main`  method makes a new instance of a  `Menu`.
    -   The  `main`  method calls the  `Menu`  methods  `greet`  and  `executeMenu`.

When you're done with this step, you'll want to see something like this output:

```shell
ddd_v1_w_l9Jr_975872@runweb52179:~/local$ run-workflow step-01                                                                                                

BUILD SUCCESSFUL in 1s
```

Go ahead and run  `run-workflow step-01`. When you run the workflow for the first time though, you'll see your first test failures / errors for the project. This isn't reason to worry. You'll get there bit by bit. In this step we'll give you a detailed walk-through.

The failure will look something like this:

```shell
ddd_v1_w_Syc_1512709@runweb64588:~/local$ run-workflow step-01                                                                  

> Task :test FAILED                                                                                                             

ShopRunnerStepOneIntegrationTest > main_provideShopperNameAndSelectExit_exits() FAILED                                          
    org.opentest4j.AssertionFailedError: 
    Mismatch on line 0:                                                                    
    Expected:[Hello. Please enter your name:]                                                                                   
    Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME]                                                                

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
    Exiting now. Goodbye.                                                                                                       

    Actual output was:                                                                                                          

    Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME                                                                           

    --Main Menu--                                                                                                               
    Select an option using one of the numbers shown                                                                             

    Mismatch on line 0:                                                                                                         
    Expected:[Hello. Please enter your name:]                                                                                   
    Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME]
    ==> expected: <true> but was: <false>                          
        at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)                                                    
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)                                                      
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:193)                                                     
        at com.ata.AbstractShopTest.assertArrayContainsContentsViaRegexMatch(AbstractShopTest.java:140)                         
        at com.ata.AbstractShopTest.assertExpectedCommandLineOutputMatchesActual(AbstractShopTest.java:221)                     
        at com.ata.AbstractShopTest.assertExpectedContentInCommandLineOutputMatchesActualOutput(AbstractShopTest.java:170)      
        at com.ata.stepone.ShopRunnerStepOneIntegrationTest.main_provideShopperNameAndSelectExit_exits(ShopRunnerStepOneIntegrat
ionTest.java:31)                                                                                                                

2 tests completed, 1 failed                                                                                                     

FAILURE: Build failed with an exception.                                                                                        

* What went wrong:                                                                                                              
Execution failed for task ':test'.                                                                                              
> There were failing tests. See the report at: file:///mnt/vocwork5/ddd_v1_w_Syc_1512709/asn955925_61/asn955926_1/work/local/bui
ld_logic/build/reports/tests/test/index.html                                                                                    

* Try:                                                                                                                          
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan t
o get full insights.                                                                                                            

* Get more help at https://help.gradle.org                                                                                      

BUILD FAILED in 2s                                                                                                              
4 actionable tasks: 2 executed, 2 up-to-date  
```

The reason for this wall of text is your application does not currently do what the requirements ask. That's OK. When you use the command  `run-workflow step-01`, under the hood we are running a test to validate you've built the functionality in the requirements. After you complete the work in step 1, this test will pass, and you'll see something much better!

There are a few important things to note from the above output:

```shell
ShopRunnerStepOneIntegrationTest > main_provideShopperNameAndSelectExit_exits()
```

This is a hint about which test class and which test case within that test class is failing. The test class is  `ShopRunnerStepOneIntegrationTest`  and the test case name is  `main_provideShopperNameAndSelectExit_exits`. You may always take a look at the test class itself, if you'd like. In this case the test class is for step one. You may find it in the folder  `resource/asnlib/public/src/readonly-integrationTest/java/com/ata/stepone`.

![Test Class Java File](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/test-class-java-file.png)

The test case name itself is a hint as to the requirement that you need to fulfill to pass it. In this case, you may deduce from the test case name that the test will provide a shopper name, select exit in the menu, and expect that the application terminates. If you read through the Basic Requirements section again, you'll see that the test case checks whether you've satisfied one of those requirements. It'll continue to fail until you write the code to satisfy that requirement.

```shell
org.opentest4j.AssertionFailedError: Mismatch on line 0:                                                                    
Expected:[Hello. Please enter your name:]                                                                                   
Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME]   
```

This is a hint letting you know that the test was expecting your CLI to output "Hello. Please enter your name:", but that the actual output was "Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME", and that the difference was on the 0th (0th is the same as first, in computing) line of output.

The output then shows you what was expected:

```shell
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
Exiting now. Goodbye.                                                                                                                                     
```

And what your code did:

```shell
Actual output was:                                                                                                                                        

Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME                                                                                                         

--Main Menu--                                                                                                                                             
Select an option using one of the numbers shown                                                                                                           
```

Your goal is to get your code to do what was expected.

**Observe the following part of the output**:

```shell
2 tests completed, 1 failed  
```

The reason for this is that both the  `step-00`  test as well as the  `step-01`  test were run when you executed this command:  `run-workflow step-01`. The important thing to understand here, is that there is a dependency between the  `step-01`and  `step-00`  tests.

**Important takeaway**: This will continue to be true for the rest of the project, too. As you continue through the steps, previous steps have to pass. That is, you can't break previous code you wrote as you continue on through the project.

**Observe this part of the output**:

```shell
There were failing tests. See the report at: file:///mnt/data2/students/sub1/ddd_v1_w_l9Jr_975872/asn746419_56/asn746420_1/work/local/build_logic/build/repo
rts/tests/test/index.html   
```

You may open the referenced HTML file, which contains a visual representation of the test failures as a test report run.

**Steps to open the test report:**

1.  Refresh the file browser by clicking the Refresh button.  ![Refresh file browser button](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/refresh-file-browser-button.png)
2.  Use the file browser to navigate over to the  `local/build_logic/build/reports/tests/test/`  directory.![Test report file location](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/test-report-file-location.png)
3.  Open the  `index.html`  file by double-clicking it.
4.  Observe the test failures.![Observed test failures in report](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/test-failures-report.png)

**HINT:**  You may always run the application from the terminal by using the following command, or clicking the  **Run**  button in the Vocareum user interface:

```shell
run-workflow run
```

If you run the application now with the  `run-workflow run`  you will see something like this:

```shell
ddd_v1_w_l9Jr_975872@runweb52179:~/local$ run-workflow run                                                                                                    
<=======------> 60% EXECUTING [6s]                                                                                                                            
> :runMain 
```

Don't worry about the  `60% EXECUTING`  message with the time counting up next to it. That just means your application is running. Press  `Ctrl-C`  to terminate, and you should be back at the prompt. Running the application will allow you to manually debug what you've built and play around as if you were the shopper. When you are done with your manual test session you terminate the application, so you may resume your work.

Now, rerun the application with  `run-workflow run`. This time, before terminating the application, type in anything into the terminal and press  `Enter`. In the following example we'll use  `ATA Shopper`. You should see something like this:

```shell
Welcome ATA Shopper to DEFAULT SHOP NAME                                                                                                                            

--Main Menu--                                                                                                                                                 
Select an option using one of the numbers shown                                                                                                               

```

In the above example, the application was waiting for input. It doesn't yet ask the user for what it wants the user to do next.

Recall the full set of output the application should have from the requirements:

```shell
Hello. Please enter your name:
ATA Shopper
Welcome ATA Shopper to T-Shirt Mart

--Main Menu--
Select an option using one of the numbers shown

0: Exit
1: List Products
2: Buy Product
3: Find Product
4: Show Cart
5: Checkout
0
Exiting now. Goodbye.
```

You should now see the core differences and what you need to build:

-   Asking the shopper for their name
-   Welcoming the shopper by their name to the T-Shirt Mart
-   Outputting a menu
-   Letting the shopper know that all options except option  `0: Exit`  are not implemented
-   When shopper selects  `0: Exit`  terminating the application and letting the shopper know what happened

To resolve all of these, tackle asking for the shopper's name first:

-   Open the Java class  `src/main/java/com/ata/Menu.java`
-   In the  `greet()`  method’s first line, add a  `println`  statement which outputs the following text:  `Hello. Please enter your name:`

Go ahead and re-run  `run-workflow step-01`. If you did everything correctly, you should now see a new error message. In other words, the test is still failing, but the error message has been updated. It will look something like this:

```shell
ddd_v1_w_Syc_1512709@runweb64588:~/local$ run-workflow step-01                                                                                                           

> Task :test FAILED                                                                                                                                                      

ShopRunnerStepOneIntegrationTest > main_provideShopperNameAndSelectExit_exits() FAILED                                                                                   
    org.opentest4j.AssertionFailedError: 
    Mismatch on line 1:                                                                                                             
    Expected:[Welcome T-Shirt Mart Shopper to T-Shirt Mart]                                                                                                              
    Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME]                                                                                                         

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
    Exiting now. Goodbye.                                                                                                                                                

    Actual output was:                                                                                                                                                   

    Hello. Please enter your name:                                                                                                                                       
    Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME                                                                                                                    

    --Main Menu--                                                                                                                                                        
    Select an option using one of the numbers shown                                                                                                                      

    Mismatch on line 1:                                                                                                                                                  
    Expected:[Welcome T-Shirt Mart Shopper to T-Shirt Mart]                                                                                                              
    Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME] 
    ==> expected: <true> but was: <false>                                                                   
        at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)                                                                                             
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)                                                                                               
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:193)                                                                                              
        at com.ata.AbstractShopTest.assertArrayContainsContentsViaRegexMatch(AbstractShopTest.java:140)                                                                  
        at com.ata.AbstractShopTest.assertExpectedCommandLineOutputMatchesActual(AbstractShopTest.java:221)                                                              
        at com.ata.AbstractShopTest.assertExpectedContentInCommandLineOutputMatchesActualOutput(AbstractShopTest.java:170)                                               
        at com.ata.stepone.ShopRunnerStepOneIntegrationTest.main_provideShopperNameAndSelectExit_exits(ShopRunnerStepOneIntegrationTest.java:31)                         

2 tests completed, 1 failed                                                                                                                                              

FAILURE: Build failed with an exception.                                                                                                                                 

* What went wrong:                                                                                                                                                       
Execution failed for task ':test'.                                                                                                                                       
> There were failing tests. See the report at: file:///mnt/vocwork5/ddd_v1_w_Syc_1512709/asn955925_61/asn955926_1/work/local/build_logic/build/reports/tests/test/index.h
tml                                                                                                                                                                      

* Try:                                                                                                                                                                   
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.                     

* Get more help at https://help.gradle.org                                                                                                                               

BUILD FAILED in 1s                                                                                                                                                       
4 actionable tasks: 1 executed, 3 up-to-date 
```

It looks like now the difference is that the shopper isn't greeted with the name of the store:

```bash
Mismatch on line 1:                                                                                                                                                  
Expected:[Welcome T-Shirt Mart Shopper to T-Shirt Mart]                                                                                                              
Actually:[Welcome T-Shirt Mart Shopper to DEFAULT SHOP NAME] ==> expected: <true> but was: <false> 
```

If you thought you might need to output the name of the shop as  `T-Shirt Mart`  instead of  `DEFAULT SHOP NAME`  that's definitely one change you'll have to make!

Make the needed change, and re-run the tests. If you've succeeded you should now see:

```bash
ddd_v1_w_Syc_1512709@runweb64588:~/local$ run-workflow step-01                                                                                                           

> Task :test FAILED                                                                                                                                                      

ShopRunnerStepOneIntegrationTest > main_provideShopperNameAndSelectExit_exits() FAILED                                                                                   
    org.opentest4j.AssertionFailedError: 
    Mismatch on line 6:                                                                                                             
    Expected:[0: Exit]                                                                                                                                                   
    Actually:[]                                                                                                                                                          

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
    Exiting now. Goodbye.                                                                                                                                                

    Actual output was:                                                                                                                                                   

    Hello. Please enter your name:                                                                                                                                       
    Welcome T-Shirt Mart Shopper to T-Shirt Mart                                                                                                                         

    --Main Menu--                                                                                                                                                        
    Select an option using one of the numbers shown                                                                                                                      

    Mismatch on line 6:                                                                                                                                                  
    Expected:[0: Exit]                                                                                                                                                   
    Actually:[] 
    ==> expected: <true> but was: <false>                                                                                                                    
        at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)                                                                                             
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)                                                                                               
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:193)                                                                                              
        at com.ata.AbstractShopTest.assertArrayContainsContentsViaRegexMatch(AbstractShopTest.java:140)                                                                  
        at com.ata.AbstractShopTest.assertExpectedCommandLineOutputMatchesActual(AbstractShopTest.java:221)                                                              
        at com.ata.AbstractShopTest.assertExpectedContentInCommandLineOutputMatchesActualOutput(AbstractShopTest.java:170)                                               
        at com.ata.stepone.ShopRunnerStepOneIntegrationTest.main_provideShopperNameAndSelectExit_exits(ShopRunnerStepOneIntegrationTest.java:31)                         

2 tests completed, 1 failed                                                                                                                                              

FAILURE: Build failed with an exception.                                                                                                                                 

* What went wrong:                                                                                                                                                       
Execution failed for task ':test'.                                                                                                                                       
> There were failing tests. See the report at: file:///mnt/vocwork5/ddd_v1_w_Syc_1512709/asn955925_61/asn955926_1/work/local/build_logic/build/reports/tests/test/index.h
tml                                                                                                                                                                      

* Try:                                                                                                                                                                   
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.                     

* Get more help at https://help.gradle.org                                                                                                                               

BUILD FAILED in 2s                                                                                                                                                       
4 actionable tasks: 1 executed, 3 up-to-date                 
```

Take a moment to think about what's happening here:

```bash
org.opentest4j.AssertionFailedError: Mismatch on line 6:                                                                                                             
Expected:[0: Exit]                                                                                                                                                   
Actually:[]             
```

Recall that one of the requirements was to print a menu.

Go back to the  `Menu`  class you opened before and do the following:

-   Initialize the  `menuOptions`  with this array of strings:
    
    ```
    "Exit", "List Products", "Buy Product", "Find Product", "Show Cart", "Checkout"
    ```
    

**REMINDER:**

-   Before running the tests again, you're encouraged to run the CLI, play with it manually, and test things out.
-   You may always do this as you continue work on the project

Rerun your tests with  `run-workflow step-01`. You should now see a small difference and your test output will look something like this:

```shell
ddd_v1_w_Syc_1512709@runweb64588:~/local$ run-workflow step-01                                                                                                           

> Task :test FAILED                                                                                                                                                      

ShopRunnerStepOneIntegrationTest > main_provideShopperNameAndSelectExit_exits() FAILED                                                                                   
    org.opentest4j.AssertionFailedError: 
    Mismatch on line 12:                                                                                                            
    Expected:[Exiting now. Goodbye.]                                                                                                                                     
    Actually:[]                                                                                                                                                          

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
    Exiting now. Goodbye.                                                                                                                                                

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

    Mismatch on line 12:                                                                                                                                                 
    Expected:[Exiting now. Goodbye.]                                                                                                                                     
    Actually:[]
    ==> expected: <true> but was: <false>                                                                                                                    
        at org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)                                                                                             
        at org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)                                                                                               
        at org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:193)                                                                                              
        at com.ata.AbstractShopTest.assertArrayContainsContentsViaRegexMatch(AbstractShopTest.java:140)                                                                  
        at com.ata.AbstractShopTest.assertExpectedCommandLineOutputMatchesActual(AbstractShopTest.java:221)                                                              
        at com.ata.AbstractShopTest.assertExpectedContentInCommandLineOutputMatchesActualOutput(AbstractShopTest.java:170)                                               
        at com.ata.stepone.ShopRunnerStepOneIntegrationTest.main_provideShopperNameAndSelectExit_exits(ShopRunnerStepOneIntegrationTest.java:31)                         

2 tests completed, 1 failed                                                                                                                                              

FAILURE: Build failed with an exception.                                                                                                                                 

* What went wrong:                                                                                                                                                       
Execution failed for task ':test'.                                                                                                                                       
> There were failing tests. See the report at: file:///mnt/vocwork5/ddd_v1_w_Syc_1512709/asn955925_61/asn955926_1/work/local/build_logic/build/reports/tests/test/index.h
tml                                                                                                                                                                      

* Try:                                                                                                                                                                   
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.                     

* Get more help at https://help.gradle.org                                                                                                                               

BUILD FAILED in 2s                                                                                                                                                       
4 actionable tasks: 2 executed, 2 up-to-date
```

The next mismatch is:

```bash
org.opentest4j.AssertionFailedError: Mismatch on line 12:                                                                                                            
Expected:[Exiting now. Goodbye.]                                                                                                                                     
Actually:[]   
```

To fix this issue, add the following line of code to the  `exit()`  method before the line  `scanner.close();`:

```java
System.out.println("Exiting now. Goodbye.");
```

Go ahead and rerun the tests.

Whenever your tests pass, you should see output that looks like this:

```shell
ddd_v1_w_l9Jr_975872@runweb52179:~/local$ run-workflow step-01                                                                                                

BUILD SUCCESSFUL in 1s                                                                                                                                        
4 actionable tasks: 2 executed, 2 up-to-date 
```

Run  `run-workflow step-01`  in your terminal to validate your work before you move to step 2. If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above. You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"
-   You have committed your work and pushed your code
-   You have earned a point after submitting your work

You may go back to the  [Main Prereqs Project Instructions](https://labs.vocareum.com/web/2180183/1165913.0/ASNLIB/public/docs/lang/en/README.md)  at any time.
