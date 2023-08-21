/* Program 82
Design a class to input a three digit number and print whether it is an Armstrong number or not.
21/07/23 */

import java.util.Scanner;

public class Program82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = n;
        int digit;
        do {
            digit = i % 10;
            sum += digit * digit * digit;
            i /= 10;
        } while (i > 0);
        System.out.println(n + " is" + (sum == n ? " " : " not ") + "an Armstrong number.");
    }
}