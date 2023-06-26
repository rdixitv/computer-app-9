/* Program 32
Write a menu-driven program to calculate the area of a circle, rectangle or triangle depending on the user's choice (choice to be entered in String).
26/06/23 */

import java.util.Scanner;

public class Program32 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:\ni. Circle\nii. Rectangle\niii. Triangle");
        String shape = sc.next();
        double a;
        switch (shape) {
            case "circle": case "i":
                System.out.print("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                a = 3.14 * r * r;
                break;
            case "rectangle": case "ii":
                System.out.print("Enter the length: ");
                double l = sc.nextDouble();
                System.out.print("Enter the breadth: ");
                double b = sc.nextDouble();
                a = l * b;
                break;
            case "triangle": case "iii":
                System.out.print("Enter the base: ");
                b = sc.nextDouble();
                System.out.print("Enter the height: ");
                double h = sc.nextDouble();
                a = (b * h) / 2;
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }
        System.out.println("The area of the " + shape + " is " + a);
    }
}