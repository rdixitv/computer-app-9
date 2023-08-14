/* Program 65
Design a class to input a three digit number and print whether it is an Armstrong number or not.
14/07/23 */

import java.util.Scanner;

public class Program65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = n;
        int digit;
        while (i > 0) {
            digit = i % 10;
            sum += digit * digit * digit;
            i /= 10;
        }
        System.out.println(n + " is" + (sum == n ? " " : " not ") + "an Armstrong number.");
    }
}