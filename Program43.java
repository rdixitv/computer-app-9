/* Program 43
Design a class to input a number and print whether it is a palindrome or not.
28/07/23 */

import java.util.Scanner;

public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        
        if (rev == n)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}