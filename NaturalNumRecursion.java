
/*
   Write a program to find the sum of natural numbers using recursion
   I/P -> N= 10
 */

package Mediumprb;
import java.util.Scanner;
public class NaturalNumRecursion {

    public static int SumNaturalNumbers (int n) {
        // base case : if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // recursive case: return n + sum of natural numbers upto n-1
        return SumNaturalNumbers(n - 1) + n;
    }
        /*
            The base case stops the recursion when it reaches 0,
            preventing infinite calls and forming the foundation of our recursive solution.
             */
        /*
        This is the recursive case.When n is greater than 0, the function adds
        n to the result of calling itself with n - 1.

        For example, if n = 5, it calculates 5 + sumNaturalNumbers(4), and this
        continues until n reaches 0
         */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // check if the input is natural number
        if (number < 0) {
            System.out.println("Negative number");
        } else {
            int sum = SumNaturalNumbers(number);
            System.out.println( "The sum of natural numbers up to " + number+ " is " + sum );
        }

    }
}
