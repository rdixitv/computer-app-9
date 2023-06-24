/* Program 30
Write a program to enter a number of the day and print the name of the day.
24/06/23 */

import java.util.Scanner;

public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        int day = sc.nextInt();
        String name;
        switch (day) {
            case 1: name = "Sunday"; break;
            case 2: name = "Monday"; break;
            case 3: name = "Tuesday"; break;
            case 4: name = "Wednesday"; break;
            case 5: name = "Thursday"; break;
            case 6: name = "Friday"; break;
            case 7: name = "Saturday"; break;
            default: name = "Invalid input";
        }
        System.out.println(name);
    }
}
