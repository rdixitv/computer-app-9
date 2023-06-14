/* Program 18
Write a Java program to enter the value of mass and velocity and compute and print the kinetic energy by the formula (1/2)mv^2.
14/06/23 */

import java.util.Scanner;

public class Program18 {
    public static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the mass of the object: ");
       double m = sc.nextDouble();
       System.out.print("Enter the velocity of the object: ");
       double v = sc.nextDouble();
       double ke = (1.0/2) * m * v * v; 
       System.out.println("The kinetic energy is " + ke);
    }
}