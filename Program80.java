/* Program 80
Design a class to input a number and print the sum of its factors.
21/08/23 */

import java.util.Scanner;

public class Program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        do {
            sum += n % ++i == 0 ? i : 0;
        } while (i <= n);

        System.out.println("The sum of the factors of " + n + " is " + sum);
    }
}