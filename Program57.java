/* Program 57
Design a class to print the product of the first n even numbers.
14/07/23 */

import java.util.Scanner;

public class Program57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        long prod = 1;
        while (i <= n)
            prod *= i++ * 2;
        System.out.println("The product of the first " + n + " even numbers is " + prod); 
    }
}