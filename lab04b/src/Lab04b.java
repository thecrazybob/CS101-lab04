import java.util.Scanner;

public class Lab04b {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // variables
        String ch;
        int width;
        int i;

        i = 0;

        System.out.println("Please enter the character that you want to print: ");
        ch = scan.next();

        System.out.println("Please enter the maximum width of the character: ");
        width = scan.nextInt();
        
        while (i < width) {
            while (i < width) {
                System.out.print(ch);
            }

            System.out.println();
            i++;
        }
        
    }

}
