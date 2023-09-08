/* Program 81
Design a class to input a number and print the sum of its even numbered and odd numbered digits separately.
21/07/23 */

import java.util.Scanner;

public class Program81 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        int digit;
        do {
            digit = n % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;
            n /= 10;
        } while (n > 0);
        System.out.println("The sum of the even numbered digits is " + evenSum + "\nThe sum of the odd numbered digits is " + oddSum);
    }
}