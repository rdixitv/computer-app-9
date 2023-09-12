/* Program 87
Write a program to print the following pattern using nested loops:
1
11
111
1111
11111
12/09/23 */

public class Program87 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
        }
    }
}