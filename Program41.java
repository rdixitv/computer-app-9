/* Program 41
Design a class to input a number and print its factorial.
25/07/23 */

import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long fac = 1;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--)
            fac *= i;

        System.out.println(n + "! = " + fac);
    }
}