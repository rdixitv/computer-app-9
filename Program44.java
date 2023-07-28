/* Program 28
Design a class to input a number and print if it is a prime number or not.
28/07/23 */

import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 1)
            flag = false;

        for (int i = 2; i < n / 2 && flag == true; i++) {
            if (n % i == 0)
                flag = false;
        }
        if (flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}