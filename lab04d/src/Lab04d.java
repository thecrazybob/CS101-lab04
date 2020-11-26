import java.io.PrintStream;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Lab04d 
 * Instructions for Lab04d are in INSTRUCTIONS.md file located in the root directory of lab04d
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab04
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/index2.html
 * 
 * @author Mohammed Sohail
 * @version 26/11/2020
 */ 

public class Lab04d {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);

        // variables
        String filename;
        int number_of_values;
        int i;
        int max;
        int min;
        int range;
        int value;

        // Prompt for filename
        System.out.println("Please provide the file name:");
        filename = scan.next();

        // Prompt for number of values to be generated
        System.out.println("Please provide the number of values:");
        number_of_values = scan.nextInt();

        // System.setOut( new PrintStream( filename + ".txt" ) );
        PrintWriter fout = new PrintWriter( filename + ".txt" );
        
        i = 0;

        // define the range 
        max = 100; 
        min = 1; 
        range = max - min + 1; 

        // Loop and generate random values for "number_of_values" 
        while (i < number_of_values) {
            
            // Calculate random value
            value = (int) (Math.random() * range) + min;

            // Save it in the file
            fout.println(value);
            
            i++;
        
        }

        // Close PrintWriter
        fout.close();

        // Print success message in console
        System.out.println("Values successfully saved in " + filename + ".txt");

        // Close scanner instance
        scan.close();
        
    }
}
