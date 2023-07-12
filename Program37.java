/* Program 37
Write a program to print the first n odd numbers.
07/07/23 */

import java.util.Scanner;

public class Program37 {
  public static void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    for (int i = 1; i <= n * 2; i += 2)
      System.out.println(i);
  }
}
