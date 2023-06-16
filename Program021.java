/* Program 21
Write a program in Java to input a number. If the number is even, print its square, otherwise print its cube. (use streams and conditional statements)
16/06/23 */

import java.io.*;

public class Program021 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0)
            System.out.println("The result is " + n * n);
        else
            System.out.println("The result is " + n * n * n);
    }
}