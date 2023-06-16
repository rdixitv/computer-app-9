/* Program 22
Write a program to enter the sides of a triangle and print if it is an equilateral, isosceles or scalene triangle.
16/06/23 */

import java.io.*;

public class Program022 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the first side: ");
        double s1 = Double.parseDouble(br.readLine());
        
        System.out.print("Enter the second side: ");
        double s2 = Double.parseDouble(br.readLine());

        System.out.print("Enter the third side: ");
        double s3 = Double.parseDouble(br.readLine());

        String res;
        if (s1 == s2 && s2 == s3)
            res = "equilateral";
        else if (s1 == s2 || s2 == s3 || s1 == s3)
            res = "isosceles";
        else
            res = "scalene";

        System.out.printf("The shape is a(n) %s triangle.%n", res);
        // above line is equivalent to:
        // System.out.println("The shape is a(n) " + res + "triangle.");
        
    }
}