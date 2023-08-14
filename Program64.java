/* Program 64
Design a class to input a number and print the sum of its even numbered and odd numbered digits separately.
14/07/23 */

import java.util.Scanner;

public class Program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            n /= 10;
        }
        System.out.println("The sum of the even numbered digits is " + evenSum + "\nThe sum of the odd numbered digits is " + oddSum);
    }
}