/* Program 49
Design a class to input a number and print whether it is a perfect number or not. A perfect number is one whose sum of its factors, except the number, is equal to the number. Eg: 6.
31/07/23 */

import java.util.Scanner;

public class Program49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        
        if (sum == n)
            System.out.println(n + " is a perfect number.");
        else   
            System.out.println(n + " is not a perfect number.");
    }
}