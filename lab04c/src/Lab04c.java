/**
 * Lab04c 
 * Instructions for Lab04c are in INSTRUCTIONS.md file located in the root directory of lab04c
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab04
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab04/
 * 
 * @author Mohammed Sohail
 * @version 26/11/2020
 */ 

public class Lab04c {
    public static void main(String[] args) throws Exception {
        double d;
        d = 0.1;
        while ( d < 1.0 )
        {
           System.out.println( d);
           d = d + 0.1;
        }
        System.out.println( d + " <- final value after loop!");

        /*
        
        Reason for code not working as expected:
        
        Doubles cannot accurately represent multiples of base 10
        Examples include: 1/3 = 0.3333...
        BigDecimal class should be used instead

        */
    }
}
