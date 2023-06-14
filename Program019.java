/* Program 19
Write a program to enter the values to the variable length and breadth and print if it is a square or a rectangle.
14/06/23 */

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = sc.nextDouble();
        String res = length == breadth ? "square" : "rectangle";
        System.out.println("The shape is a " + res);
    }
}