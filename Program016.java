/* Program 16
Write a program to enter a class to the variable standard and print "high school" if the class is 8 or above and "middle school" if below 8.
14/06/23 */

import java.util.Scanner;

public class Program16 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the class of the student: ");
        int standard = sc.nextInt();
        String res = standard >= 8 ? "high school" : "middle school";
        System.out.println("The student is in " + res);
    }
}