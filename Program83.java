/* Program 83
Design a class to input a number and print whether it is a perfect number or not.
21/08/23 */

import java.util.Scanner;

public class Program83 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        do {
            sum += n % ++i == 0 ? i : 0;
        } while (i <= n / 2);
        System.out.println(n + " is" + (sum == n ? " " : " not ") + "a perfect number.");
    }
}