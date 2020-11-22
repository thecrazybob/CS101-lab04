import java.util.Scanner;

public class Lab04a {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // variables

        int user_given_n;
        int i;
        int values_printed_out;
        String newline = System.getProperty("line.separator");

        // program code

        // Prompt for value;
        System.out.println("Please enter a number (must be positive):");
        user_given_n = scan.nextInt();

        // Print out an error message if the value is less than 0 / not positive
        if (user_given_n < 0) {
            System.out.println("Invalid value given. Please provide a positive value!");
        }

        // 1. Loop through 0 up to n exclusive
        i = 0;

        while (i < user_given_n) {
            System.out.println(i);
            i++;
        }
        
        // 2. Loop through 0 up to n exclusive - five values per line sep. by space
        i = 0;

        System.out.println(newline);


        while (i < user_given_n) {

            if (((i + 1) % 5) != 0) {

                System.out.print(i + " ");

            }

            else {

                System.out.println(i);

            }

            i++;
            
        }
        
        // 3. Loop through n down to 0 inclusive - single line sep. by space
        i = user_given_n;

        System.out.println(newline);

        while (i >= 0) {

            System.out.println(i + " ");
            i--;

        }

        // 4. Loop through -n up to n inclusive - single line sep. by space
        i = -user_given_n;

        System.out.println(newline);

        while (i <= user_given_n) {

            System.out.print(i + " ");
            i++;

        }

        // 5. Loop through squares of the even values from 0 up to n inclusive - 5 values per line sep. by space
        i = 0;

        System.out.println(newline);

        while (i <= user_given_n) {

            if (i % 2 == 0) {

                if ( ( (i+2) % 5 ) != 0) {
            
                    System.out.print((i * i) + " ");

                }

                else {

                    System.out.println(i * i);

                }
            
            }

            i++;

        }

        // 6. Loop through values divisible by 3 or 4, but not both, from n down to 3 inclusive
        i = user_given_n;
        values_printed_out = 0;

        System.out.println(newline);

        while (i >= 3) {

            if (i % 3  == 0 || i % 4 == 0) {

                if (! (i % 3 == 0 && i % 4 == 0)) {

                    if ( (values_printed_out + 1) % 5 != 0) {
                        System.out.print(i + " ");
                    }

                    else {
                        System.out.println(i);
                    }

                    values_printed_out++;

                }
            }

            i--;

        }

        // 7. Loop that outputs all of the divisors of n. For example, if n is 12, it should display 2 3 4 6 12.
        i = 1;

        System.out.print(newline);

        while (i <= user_given_n) {

            if (user_given_n % i == 0) {
                System.out.print(i + " ");
            }

            i++;
        }

    }
}
