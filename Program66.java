/* Program 66
Design a class to input a number and print whether it is a perfect number or not.
14/08/23 */

import java.util.Scanner;

public class Program66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n / 2)
            sum += n % ++i == 0 ? i : 0;
        System.out.println(n + " is" + (sum == n ? " " : " not ") + "a perfect number.");
    }
}