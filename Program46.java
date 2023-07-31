/* Program 46
Design a class to input a number and print the sum of its factors.
31/07/23 */

import java.util.Scanner;

public class Program46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++)
      if (n % i == 0)
        sum += i;

    System.out.println("The sum of the factors of " + n + " is " + sum);
  }
}
