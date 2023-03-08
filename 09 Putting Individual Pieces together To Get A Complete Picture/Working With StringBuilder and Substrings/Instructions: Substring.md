
# Substrings

## Introduction to substrings

In this topic, we learned about two different use cases for substrings. In this activity, we will implement a version of the first use case we saw in order to get the parts of an URL.

Recall the syntax for working with substrings.

```
// getting the lenght of a string
int size = str.length();

// finding the index of a particular substring in a string
int idx = str.indexOf(substring);

// finding the index of a particular substring in a string starting from an index
int idx = str.indexOf(substring, fromIndex);

// create a substring starting from startIndex of string
String part = str.substring(startIndex);

// create a substring starting from startIndex and ending at endIndex of a string
String part = str.substring(startIndex, endIndex);
```

Also recall the following information:

-   When indexing for a  `String`  in Java, the first character corresponds to index 0.
-   When using  `substring`  to get a range of characters from a  `String`, the  `endIndex`  is not included in the result.  
    Ex:  `startIndex`  of 0 and  `endIndex`  of 3 will get characters at index 0, 1, 2.

Let's take a look the example URL we saw in our topic.

![alt "URL sample"](https://github.com/Caldwell-WGU/ATA-Prerequisite-Course/blob/main/Images/url_sample.png)

A different color box surrounds each part of the URL that we will be using  `substring`  to get.

All code will be implemented in the  `URLParser`  class under the specified method in the file:`work/src/main/java/com/ata/URLParser.java`

## Step 1 of substrings

The red box represents the protocol of the URL and will be the first thing we get. Implement the necessary logic to get the protocol in the  `getProtocol`  method provided under the comment  `TODO: Step 1 - Replace return null to return the protocol of url`.

Here is something to take into consideration for this method:

-   The sample url shows  _https_  as the protocol but there are other different protocols as well. So you cannot hard code in the  `endIndex`  of the  `substring`  method. You will need to use the  `indexOf`  method to get the end index.

Run  `run-workflow step-01`  in your terminal to validate your work.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-01`  passes with "BUILD SUCCESSFUL"

## Step 2 of substrings

The green box represents the hostname of the URL and will be the second thing we get. Implement the necessary logic to get the hostname in the  `getHostname`  method provided under the comment`TODO: Step 2 - Replace return null to return the hostname of url`.

Here are things to take into consideration for this method:

-   The hostname does not always start with  _www_. You cannot just use that to get the start index with the  `indexOf`  method. What you can do is get the length of the protocol string and then add 3 (the  _://_  is 3 characters) to it to get the start index.
-   Because there are multiple  _/_  in the URL, you cannot just use  `indexOf`  to find the  _/_  after the hostname since  `indexOf`  will return the index for the first instance of the  _/_  in the URL. To get around that, you must specify the  `fromIndex`  in the  `indexOf`  method in order to start searching for the  _/_  after the protocol and  _://_.
-   Since you have already gotten the protocol using the  `getProtocol`  method, you can call that method in order to get the protocol. That way you don't have to rewrite the logic in the  `getHostname`  method.

Run  `run-workflow step-02`  in your terminal to validate your work.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-02`  passes with "BUILD SUCCESSFUL"

## Step 3 of substrings

The blue box represents the path of the URL and will be the last thing we get. Implement the necessary logic to get the path of the URL in the  `getPath`  method provided under the comment  `TODO: Step 3 - Replace return null to return the path of url`.

Here are things to take into consideration for this method.

-   Again because there are multiple  _/_  in the URL, you cannot just use  `indexOf`  to find the  _/_  for the  `startIndex`  for the path.
-   To find the  `startIndex`  needed for the  `substring`  method to get the path, you must add up the length of all the previous parts. Below are the parts you need to add up to get the  `startIndex`for  `substring`.
    -   Length of the protocol
    -   The length of  _://_  (3)
    -   The length of hostname
    -   The length of the  _/_  before the path (1)
-   You can call the previous two methods you implemented within this method so that you don't have to rewrite the logic to get the protocol and hostname again.

Run  `run-workflow step-03`  in your terminal to validate your work.

If all tests for the step are passing you will see  **BUILD SUCCESSFUL**  in your terminal window. If tests are failing you will see  **BUILD FAILED**  with the failing tests along with their messages in the output above.

You have completed this step when:

-   `run-workflow step-03`  passes with "BUILD SUCCESSFUL"

## Submitting your work

You can ensure all tests pass before submitting by clicking the  **Build**  button. You will see  **BUILD SUCCESSFUL**  in your terminal. If tests are failing you will see  **BUILD FAILED**  with the failing test output above.

You may also run  `run-workflow test-all`  to validate all steps are passing.

Click the  **Submit**  button to submit your work and review your grade.
