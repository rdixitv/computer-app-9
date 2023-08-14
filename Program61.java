/* Program 61
Design a class to input a number and print whether it is a prime number or not.
14/08/23 */

import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 2;
        boolean flag = true;
        while (i <= n / 2) {
            if (n % i == 0) {
                flag = false;
                break;
            } 
            i++;
        }
        System.out.println(n + " is" + (flag ? " " : " not ") + "a prime number.");
    }
}