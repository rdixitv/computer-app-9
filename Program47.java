/* Program 47
Design a calss to input a number and print the sum of its even numbered and odd numbered digits separately.
31/07/23 */

import java.util.Scanner;

public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        for(; n > 0; n /= 10) {
            int digit = n % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
        }
        System.out.println("The sum of the even numbered digits is: " + evenSum);
        System.out.println("The sum of the odd numbered digits is: " + oddSum);
    }
}