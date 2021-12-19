
/**
 * This program finds the prime numbers based on an enduser-given interval
 *
 * @author Ruthie Dignan
 * @version 3/24/21
 */
import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //variables
        int lower, upper, a, b, test;
        
        //end user prompts
        System.out.println("Insert the lower bound number of the interval:");
        lower = sc.nextInt();
        
        System.out.println("Insert the upper bound number of the interval:");
        upper = sc.nextInt();
        
        System.out.println("Based on the given interval of " + lower + " and " + upper + ", the prime numbers include: ");
        
        //calculating prime through traversing
        if (lower == 1) {
        System.out.println(lower);
        lower++;
        if (upper >= 2) {
            System.out.println(lower);
            lower++;
          }
        }   
        if (lower == 2)
            System.out.println(lower);
        if (lower % 2 == 0)
            lower++;    
          
        for (a = lower; a <= upper; a = a + 2) {
            test = 1;
            for (b = 2; b * b <= a; ++b) {
            if (a % b == 0) {
                test = 0;
                break;
            }
            
        }
            if (test == 1)
                System.out.println(a);
        }
    }

}
