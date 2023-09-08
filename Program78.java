/* Program 78
Design a class to input a number and print whether it is a prime number or not.
21/08/23 */

import java.util.Scanner;

public class Program78 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 2;
        boolean flag = true;
        do {
            if (n % i == 0) {
                flag = false;
                break;
            } 
            i++;
        } while (i <= n / 2);
        System.out.println(n + " is" + (flag ? " " : " not ") + "a prime number.");
    }
}