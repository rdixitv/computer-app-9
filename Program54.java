/* Program 54
Design a class to print the first n odd numbers.
07/08/23 */

import java.util.Scanner;

public class Program54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n * 2) {
            System.out.println(i);
            i += 2;
        }
    }
}