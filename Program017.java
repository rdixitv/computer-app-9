/* Program 17
Write a program to enter digits for units place, digit for tens place and a digit for the hundreds place and using mathematical relations of place values of a number, display the number.
14/06/23 */

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit for the units place: ");
        int u = sc.nextInt();
        System.out.print("Enter a digit for the tens place: ");
        int t = sc.nextInt();
        System.out.print("Enter a digit for the hundreds place: ");
        int h = sc.nextInt();
        int res = 100 * h + 10 * t + u;
        System.out.println("The number is " + res);
    }
}