/* Program 75
Design a class to input a number and print its factorial.
21/08/23 */

import java.util.Scanner;

public class Program75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = n;
        long fac = 1;
        do {
            fac *= i--;
        } while (i >= 1);
        System.out.println(n + "! = " + fac);
    }
}