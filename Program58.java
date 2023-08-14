/* Program 58
Design a class to input a number and print its factorial.
14/08/23 */

import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = n;
        long fac = 1;
        while (i >= 1)
            fac *= i--;
        System.out.println(n + "! = " + fac);
    }
}