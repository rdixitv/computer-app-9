/* Program 31
Write a menu-driven program to calculate the area of a circle, or the perimeter, after entering the choice and radius (choice to be entered in character).
26/04/23 */

import java.util.Scanner;

public class Program31 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:\na. Area of circle\nb. Perimeter of circle");
        char choice = sc.next().charAt(0);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        switch (choice) {
            case 'a': case 'A':
                double res = 3.14 * r * r;
                System.out.println("The area of the circle is " + res);
                break;
            case 'b': case 'B':
                res = 6.28 * r;
                System.out.println("The perimeter of the circle is " + res);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}