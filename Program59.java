/* Program 59
Design a class to input a number and print the number in reverse order.
14/08/23 */

import java.util.Scanner;

public class Program59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int i = n;
        while (i > 0) {
            rev = rev * 10 + i % 10;
            i /= 10;
        }
        System.out.println("The reverse of " + n + " is " + rev);
    }
}