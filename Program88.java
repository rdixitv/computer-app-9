/* Program 88
Write a program to print the following pattern using nested loops:
11111
1111
111
11
1
12/09/23 */

public class Program88 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}