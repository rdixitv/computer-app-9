/* Program 42
Design a class to input a number and find the reverse of it and print it.
28/07/23 */

import java.util.Scanner;

public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;

        System.out.println("The reverse of " + n + " is " + rev);
    }
}