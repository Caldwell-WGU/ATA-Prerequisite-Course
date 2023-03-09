
# Using terminal commands to perform basic tasks

## Introduction to using terminal commands to perform basic tasks

At your job, your boss asks you to uncover some data that lives in the file system. To do this your only option is to use the terminal and terminal commands to find these data elements, because there is no Graphical User Interface available to do the work. Think of it like a terminal scavenger hunt!

In this activity you will use terminal commands to find the data, copy some of it, move some of it, and delete some that are not needed.

## VERY IMPORTANT INSTRUCTIONS - PLEASE READ CAREFULLY:

Each step in this exercise will have you create a log file, such as  `data_research_log_step_2.txt`  for Step 2. If when you run a workflow for that step you get errors that you do not expect, it may be for one of a number of reasons:

1.  The instructions in that step were not carefully followed
2.  The order of the sub-steps was not followed precisely
3.  The log file may not have been created with the correct file name, per the step's instructions
4.  A bug in our system may have occurred - generally speaking this won't be the reason

One common misstep you may encounter, is that if you do not create the log file with the correct file name, you'll see an error that looks like this, when running one of the workflows:

```shell
ddd_v1_w_l9Jr_975872@runweb47290:~$ run-workflow step-02                                                                                                            

> Task :test FAILED                                                                                                                                                 

DataResearchLogLsTest > fileHasExpectedNumberOfLines() FAILED                                                                                                       
    java.lang.IllegalArgumentException: Invalid file path                                                                                                           
        at com.ata.input.file.ATAFileReader.<init>(ATAFileReader.java:26)                                                                                           
        at com.ata.ActivityTest.fileHasExpectedNumberOfLines(ActivityTest.java:25)                                                                                  
        at com.ata.DataResearchLogLsTest.fileHasExpectedNumberOfLines(DataResearchLogLsTest.java:14)                                                                

1 test completed, 1 failed                                                                                                                                          

FAILURE: Build failed with an exception.
```

**Before you begin a step, please be sure to read that step's instructions carefully and understand what is expected, and only then start work on that step.**

**Note that as you work through the steps, we will give less concrete instructions about what to do, so you may work through slightly increasing levels of difficulty with each step.**

If you experience any issues that you cannot seem to resolve, we would recommend deleting that step's log file with the  `rm`  command followed by the log file's name, and restarting that step, being extra careful in following that step's instructions.

## Step 1 of using terminal commands to perform basic tasks

First, you will create a file that will store the log summary of your research. This file will start out empty, but will eventually contain all the things you will discover in the rest of this step.

Go ahead and create a new file in the current working directory in the terminal by using the  `touch`  command. The file should be called  `data_research_log_step_2.txt`.

You will be using the above file in Step 2. But, don't jump ahead yet. Run  `run-workflow step-01`  in your terminal to validate your work for step 1 before moving on to the next step.

## Step 2

Next, you need to find and list the directory contents of the directory  `list_my_contents`. It's located in the current working directory. Recall that the command to list directory contents is  `ls`. This time, though, use the  `ls`  command combined with the parameters  `-la`  like so:  `ls -la _________`, and fill in the blank with the directory name. This will perform a slightly different directory listing than you've learned about. This form of the command will do two additional things:

1.  `-l`  will use a long listing format
2.  `-a`  will not ignore entries starting with  `.`  - that means it will show both the  `.`  and  `..`  directory shortcuts

The  `-l`  and  `-a`  may have been specified separately, like so:  `ls -l -a list_my_conents`, but  `ls -la list_my_contents`  is shorter and cleaner.

Try it in the terminal now:  `ls -la list_my_contents`.

Now, run the following command:

```shell
ls -la list_my_contents > data_research_log_step_2.txt
```

Guess what? The command above did 2 things:

1.  Performed a directory listing of  `list_my_conents`, with the  `-la`  parameters from above.
2.  Output the contents of the command into the file  `data_research_log_step_2.txt`.

Try this command  `cat data_research_log_step_2.txt`  to verify.

You may not have learned about the  `cat`  command. Its purpose is to concatenate files and print on the standard output. More simply put, the  `cat`command can output the contents of files, which is exactly what happened.

Run  `run-workflow step-02`  in your terminal to validate your work for step 2 before moving on to the next step.

## Step 3

Next, you need to copy a file to an appropriate directory. Recall that you'll want to use the  `cp`  command for this.

Before you copy the file, please create the log file  `data_research_log_step_3.txt`  in the current directory. Recall that creating a file is done with the  `touch`  command.

You may verify that you have the right log file after you've created it by executing the command  `ls data_research_log_step_3.txt`. When you execute that command, you should see something like this in your terminal:

```shell
ddd_v1_w_l9Jr_975872@runweb47273:~$ ls data_research_log_step_3.txt                                                                                           
data_research_log_step_3.txt
```

If you see something like this instead, you probably didn't create the file correctly:

```shell
ddd_v1_w_l9Jr_975872@runweb47273:~$ ls data_research_log_step_3.txt                                                                                           
ls: cannot access 'data_research_log_step_3.txt': No such file or directory
```

Next, go ahead and copy the file from  `list_my_contents/dir_1/copy_me_to_dir_3`  over to  `list_my_contents/dir_3`.

Finally, let's have you run these two commands:

1.  `ls -la list_my_contents/dir_3 >> data_research_log_step_3.txt`
2.  `ls -la list_my_contents/dir_1 >> data_research_log_step_3.txt`

Did you catch the  `>>`  instead of the  `>`  in previous similar instructions? That's because  `>>`  _appends_  lines to a file, whereas  `>`  does not append, but replaces the contents of the  `data_research_log_step_3.txt`  file. Pick the double caret  `>>`  or single caret  `>`  in future cases, based on your need/use case. By the way, both the  `>>`  and the '>' are redirection operators.

Run  `run-workflow step-03`  in your terminal to validate your work for step 3 before moving on to the next step.

## Step 4

Next, you need to move a file to an appropriate directory. Recall that you'll want to use the  `mv`  command for this.

Before you move the file, please create the log file  `data_research_log_step_4.txt`  in the current directory.

Next, go ahead and move the file from  `list_my_contents/dir_2/move_me_to_dir_1`  over to  `list_my_contents/dir_1`.

Finally, let's have you run these two commands:

1.  `ls -la list_my_contents/dir_2 >> data_research_log_step_4.txt`
2.  `ls -la list_my_contents/dir_1 >> data_research_log_step_4.txt`

Run  `run-workflow step-04`  in your terminal to validate your work for step 4 before moving on to the next step.

## Step 5

Next, you need to remove a file. Recall that removing files may be done with the  `rm`  command.

Take a peek at the file you will be removing in the  `list_my_contents/dir_3`  directory by executing this command:  `ls list_my_contents/dir_3`. Take note of the file named  `remove_me`.

Next, remove that file using the  `rm`  command.

Finally, let's log your work in a file that you should create called  `data_research_log_step_5.txt`. Similar to prior steps, output the contents of the  `list_my_contents/dir_3`  into  `data_research_log_step_5.txt`.

Finally, to test your work run  `run-workflow step-05`  in your terminal to validate your work for step 5.
