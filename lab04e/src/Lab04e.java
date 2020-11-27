import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Lab04e 
 * Instructions for Lab04e are in INSTRUCTIONS.md file located in the root directory of lab04e
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab04
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/
 * 
 * @author Mohammed Sohail
 * @version 26/11/2020
 */ 

public class Lab04e {
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner( System.in);
        Scanner dataInputFile = new Scanner( new File( "values.txt") );

        // constants
        final int n = 6;

        // variables
        int i;
        int lines;
        int value;
        int sum;
        int max;
        int min;
        int count;
        int avg;

        // initializing variables
        i = 0;
        sum = 0;
        count = 0;

        // Prompt for values and loop through it
        while (i < n) {

            System.out.println("Please enter a value:");

            value = scan.nextInt();

            sum += value;
            count += 1;
            i++;

        }

        // Print sum and count of the values given
        System.out.println("Sum of " + n + " integers: " + sum);
        System.out.println("Count of integers: " + count);

        // Re-initializing variables
        i = 0;
        sum = 0;
        max = 0;
        min = 0;
        lines = 100;
        avg = 0;
        
        // Loop to 100 lines from file
        while (i < lines) {
            
            // Get value from file
            value = dataInputFile.nextInt();

            // Assign first value as minimum
            if (i == 0) {
                min = value;
            }

            // Assign value as maximum if it is greater than the existing maximum
            if (value > max) {
                max = value;
            }

            // Assign value as minimum if it is lower than the existing minimum
            if (value < min) {
                min = value;
            }

            // Add value to sum
            sum += value;
            
            i++;
        }

        // Calculate average
        avg = sum / lines;

        // Print out avg, max and min
        System.out.println("Average of " + lines + " integers: " + avg);
        System.out.println("Maximum of " + lines + " integers: " + max);
        System.out.println("Minimum of " + lines + " integers: " + min);

        // Re-initializing variables
        i = 0;
        sum = 0;
        max = 0;
        min = 0;
        lines = 10000;
        avg = 0;
        
        // Loop through 10000 lines from file
        while (i < lines) {
            
            // Get value from file
            value = dataInputFile.nextInt();

            // Assign first value as minimum
            if (i == 0) {
                min = value;
            }

            // Assign value as maximum if it is greater than the existing maximum
            if (value > max) {
                max = value;
            }

            // Assign value as minimum if it is lower than the existing minimum
            if (value < min) {
                min = value;
            }

            // Add value to sum
            sum += value;
            
            
            i++;
        }

        // Calculate average
        avg = sum / lines;

        // Print out avg, max and min
        System.out.println("Average of " + lines + " integers: " + avg);
        System.out.println("Maximum of " + lines + " integers: " + max);
        System.out.println("Minimum of " + lines + " integers: " + min);

        // Close file and scanner instance
        dataInputFile.close();
        scan.close();

    }
}
