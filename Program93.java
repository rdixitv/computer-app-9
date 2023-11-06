/* Program 93
Write a program to print the following pattern using nested loops:
    1
   2 2
  3 3 3
 4 4 4 4
... n times
3-11-23 */

import java.util.Scanner;

public class Program93 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++)
        System.out.print(' ');

      for (int j = 1; j <= i; j++)
        System.out.print(i + " ");

      System.out.println();
    }
  }
}
