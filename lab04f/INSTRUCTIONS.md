### (e) Processing data...

Write a program, Lab04e, that will read exactly** n **integer values from the user, adding each value to a sum and simultaneously counting them; then, after the last one has been processed, report their sum and count. The value of **n** should be fixed, e.g. 6, and any values that are entered after the **n**'th one should be ignored. *Note: do not attempt to store the values read from the user; simply process each one as it is read!*

Using your random number generating program from part (d) above, create several test data files containing different sets of numbers. There are now two ways in which you can process these data files. The first and simplest, is to use I/O redirection; the second is to modify your program so it explicitly reads from a named file, in much the same way you did with outputs in Lab03! You should try both of these techniques.

**(1)** In order to have your Lab04e program get its input from a file using the standard I/O redirection technique you encountered in Lab02, by doing the following:

Open a command prompt (terminal) and navigate to the folder containing your class file. From the command prompt, run your program by typing the command "java Lab04e  <  testdata.txt", which should cause your program to read its input from the specified file, rather than the keyboard. It will still output its results to the command prompt.  Note: you can have your program read data from one file and send its output to another file by typing, for example, "java Lab04e < testdata.txt > results.txt". Try it, then open "results.txt" to see what happened!

**(2) **To have your program explicitly read from the data file, you will need to create another Scanner object that connects to the file, rather than the keyboard. No guarantees, but try this,

At the start of your program file, after the line "import java.util.Scanner;" add lines saying  "import java.io.File;" and import "java.io.IOException;" Then, after the line "Scanner scan = new Scanner( System.in);", add another that says "Scanner dataInputFile = new Scanner( new File( "testdata.txt") );". Next where-ever you want to get data from the file, change the line so instead of something like "value = scan.nextInt();", it says "value = dataInputFile.nextInt();". At the end of your program add "dataInputFile.close();" to tell the system you have finished with the file.

Once you have at least one of these techniques working, modify your Lab04e program so that it finds the average, minimum and maximum, of the first 100 values, then of the first 10000 values!