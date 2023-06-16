/* Program 15
Write a program to input a value to the variable age and print if the person is a major or a minor.
14/06/23 */

import java.util.Scanner;

public class Program015 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        String res = age >= 18 ? "major" : "minor";
        System.out.println("The person is a " + res);
        sc.close();
    }
}