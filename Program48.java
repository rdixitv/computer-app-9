/* Program 48
Design a class to input a three digit number and print whether it is an Armstrong number or not.
31/07/23 */

import java.util.Scanner;

public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int digit = i % 10;
            sum += digit * digit * digit;
        }
        if (sum == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}