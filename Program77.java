/* Program 77
Design a class to input a number and print if it is a palindrome or not.
21/08/23 */

import java.util.Scanner;

public class Program77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int i = n;
        do {
            rev = rev * 10 + i % 10;
            i /= 10;
        } while (i > 0);
        System.out.println(n + " is" + ((rev == n) ? " " : " not ") + "a palindrome.");
    }
}