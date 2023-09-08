/* Program 85
Write a menu driven program to calculate and print the sum of the following series.
i. 1/2 + 2/3 + 3/4 + ... + (n-1)/n
ii. 1 + x^1 - x^2 + x^3 - x^4 + x^5 + ... + x^n
08/09/23 */

import java.util.Scanner;

public class Program85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\ni. Series i\nii. Series ii");
        String choice = sc.next();
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double sum = 0;
        switch (choice) {
            case "i":
                for (int i = 2; i <= n; i++) {
                    sum += ((double) i - 1) / i;
                }
                break;
            case "ii":
                sum = 1;
                System.out.print("Enter base number: ");
                double x = sc.nextDouble();
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0)
                        sum -= Math.pow(x, i);
                    else
                        sum += Math.pow(x, i);
                }
                break;
            default:
                System.out.println("Invalid input: " + choice);
        }
        System.out.println(sum);
    }
}