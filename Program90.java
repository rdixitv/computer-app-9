/* Program 90
Write a program to print the following pattern using nested loops:
1
22
333
4444
55555
30/10/23
*/

public class Program90 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print(i);
      System.out.println();
    }
  }
}
