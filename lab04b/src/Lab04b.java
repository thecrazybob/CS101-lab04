import java.util.Scanner;

/**
 * Lab04b 
 * Instructions for Lab04b are in INSTRUCTIONS.md file located in the root directory of lab04b
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab04
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/
 * 
 * @author Mohammed Sohail
 * @version 26/11/2020
 */ 

public class Lab04b {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // variables
        String ch;
        int width;
        int i;
        int inner_index;

        i = 0;

        // Start of PART 1

        // Prompt for character
        System.out.println("Please enter the character that you want to print: ");
        ch = scan.next();

        // Prompt for maximum width
        System.out.println("Please enter the maximum width of the character: ");
        width = scan.nextInt();
        
        // Loop and print the triangle using the character and width provided by the user
        while (i < width) {

            inner_index = 0;

            while ( (inner_index -1) < i ) {
                System.out.print(ch);

                inner_index++;
            }

            System.out.println();
            
            i++;

        }

        // End of PART 1

        // Start of PART 2

        // Reset index to 0
        i = 0;

        // Prompt for character
        System.out.println("Please enter the character that you want to print: ");
        ch = scan.next();

        // Prompt for maximum width
        System.out.println("Please enter the maximum width of the character: ");
        width = scan.nextInt();

        // Loop and print the triangle using the character and width provided by the user
        while (i < width) {

            inner_index = width;

            while ( inner_index > i ) {
                System.out.print(ch);

                inner_index--;
            }

            System.out.println();
            
            i++;

        }

        // End of PART 2

        // Close Scanner Instance
        scan.close();
        
    }

}
