
/*
    Write a code in java to find the sum of the divisor of N-Integer
    For input n = 6, divisors are 1, 2, 3, and 6 (example)
 */

package Mediumprb;
import java.util.Scanner;

public class SumDivisor_N_Integer {
    public static int sumDivisor(int n) {
        int sum = 0; // initialization of the sum

        // apply the for loop
        for (int i = 1; i <= n/2; i++) { // since no num is greater than n/2 other than n
            if (n % i == 0) {
                sum += i; // add that divisor number to the sum value
            }
        }
        sum = sum + n; // now the num itself is a divisor
        return sum;
    }

    // the main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("the sum of the divisors is: " + sumDivisor(n));


    }
}
