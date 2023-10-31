/* Program 91
Write a program to print the following pattern using nested loops.
a
aa
aaa
aaaa
aaaaa
aaaa
aaa
aa
a
30/10/23 */

public class Program91 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print('a');
      System.out.println();
    }
    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= i; j++)
        System.out.print('a');
      System.out.println();
    }
  }
}
