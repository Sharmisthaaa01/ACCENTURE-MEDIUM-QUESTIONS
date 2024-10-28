
/*
    The fibonacci numbers, commonly denoted f(n) from a sequence, called the
    fibonacci sequence, such that
    each number is the sum of the two preceding ones, starting from 0 and 1.

    I/p -> n=2
    O/p -> 1
 */

package Mediumprb;
import java.util.Scanner;
public class FibonacciSequence {
    public static void IfFibonacciSequence(int n) {

        // initialization of first and second term as 0 and 1
        int first = 0 , second = 1;

        System.out.print("Fibonacci sequence: ");

        // iterate to print the sequence of series
        for( int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the sequence");
        int n = sc.nextInt();

        // call the function
        IfFibonacciSequence(n);
    }
}
