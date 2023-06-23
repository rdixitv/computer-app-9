/* Program 27
Write a program to input a three digit number and print if it is an Armstrong number ( An Armstrong number is a number where the sum of the cubes of its digits equals the number itself. eg: 153, 370, 371, 407).
23/06/23 */

import java.util.Scanner;

public class Program27 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int n = sc.nextInt();
        int u = n % 10;
        int t = (n % 100) / 10;
        int h = n / 100;

        if (u * u * u + t * t * t + h * h * h == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    } 
}