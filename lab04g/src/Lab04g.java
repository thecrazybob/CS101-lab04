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

public class Lab04g {
    public static void main(String[] args) throws IOException {
        
        Scanner dataInputFile = new Scanner( new File( "values.txt") );

        // variables
        int i;
        int number_of_lines;
        int value;
        int avg;
        int sum;
        int minimum;
        int maximum;
        boolean negative_value_found;

        // Initializing variables
        i = 0;
        number_of_lines = 10;
        sum = 0;
        avg = 0;
        minimum = 0;
        maximum = 0;
        negative_value_found = false;

        // Loop through number of lines
        while (i < number_of_lines) {
            
            // Read the value from file
            value = dataInputFile.nextInt();

            // Verify if the value is a negative value
            if (!negative_value_found) {

                if (value < 0) {
                    negative_value_found = true;
                }

            }

            // Continue if first negative value has been found
            else {
                
                // Assign first value as minimum
                if (i == 0) {
                    minimum = value;
                }

                // Assign value as maximum if it is greater than the existing maximum
                if (value > maximum) {
                    maximum = value;
                }

                // Assign value as minimum if it is lower than the existing minimum
                if (value < minimum) {
                    minimum = value;
                }

                // Add value to sum
                sum += value;

            }

            i++;
            
        }

        // Calculate average
        avg = sum / number_of_lines;

        // Print out avg, max and min
        System.out.println("Average of " + number_of_lines + " integers: " + avg);
        System.out.println("Maximum of " + number_of_lines + " integers: " + maximum);
        System.out.println("Minimum of " + number_of_lines + " integers: " + minimum);

    }
}
