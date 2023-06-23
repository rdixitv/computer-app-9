/* Program 26
Write a program to input three numbers and print in ascending order.
19/06/23 */

import java.io.*;

public class Program26 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the first number: ");
        int n1 = Integer.parseInt(br.readLine());
        System.out.print("Enter the second number: ");
        int n2 = Integer.parseInt(br.readLine());
        System.out.print("Enter the third number: ");
        int n3 = Integer.parseInt(br.readLine());

        if (n1 >= n2 && n1 >= n3) {
            if (n2 > n3)
                System.out.printf("%d, %d, %d%n", n3, n2, n1);
            else
                System.out.printf("%d, %d, %d%n", n2, n3, n1);
        }
        else if (n2 >= n1 && n2 >= n3) {
            if (n1 > n3)
                System.out.printf("%d, %d, %d%n", n3, n1, n2);
            else
                System.out.printf("%d, %d, %d%n", n1, n3, n2);
        }
        else {
            if (n2 > n1)
                System.out.printf("%d, %d, %d%n", n1, n2, n3);
            else
                System.out.printf("%d, %d, %d%n", n2, n1, n3);
        }
    }
}
