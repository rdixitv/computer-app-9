/* Program 71
Design a class to print the first n odd numbers.
21/08/23 */

import java.util.Scanner;

public class Program71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        } while (i <= n * 2);
    }
}