###  (d) Generating data...

Write a little program, Lab04d, that will generate a set of random positive integer values and store them in a file, one value per line. Your program should get the filename and the required number of values from the user.

**Note:** To generate the random numbers use Math.random(), which generates real values in the range 0.0 upto but not including 1.0. It is then simply a matter of maths to change the range/domain, and then typecast the result to integer.

**Note:** There are several ways you might consider creating the file. You have already seen two in previous labs.

**Lab02**, for instance, demonstrated how you could use the operating system's ability to redirect standard output to a file, rather than the console, when running the program from the command prompt (e.g. *java MyProg > "afile.txt"* ).

**Lab03** used the same functionality, but did it from within your program using Java (e.g. *System.setOut( new PrintStream( "afile.txt" ) ); *) redirected any output from subseqeuent System.out.println statements, to the file.*\
*

Since you need to get the filename from the user, you can't use the first option, however, the second one should work fine. Another alternative is to use Java's ability to create multiple output streams. You can send output to both the console and files independently, and at the same time, using PrintWriter. To do this...

**Lab04**  Add "import java.io.PrintWriter;" and "import "java.io.IOException;" to the top of your program, then add "throws IOException" to the end of the "public static void main( String[] args)" line. Once you have got the *requiredFilename* from the user simply create a PrintWriter using the statement "PrintWriter fout = new PrintWriter( *requiredFilename* );". Finally, make sure you also add "fout.close();" at the end of your program to tell the system you have finished with the file. Having done that, you can now use "fout.println( anything );", to send whatever output you want to the file, in the same way you send output to the console using "System.out.println( anything );". Neat eh?