/* Program 23
Write a program to input a digit and print it in words.
16/06/23 */

import java.io.*;

public class Program23 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a digit from 0 to 9: ");
        int d = Integer.parseInt(br.readLine());

        String res;
        if (d == 0) res = "zero";
        else if (d == 1) res = "one";
        else if (d == 2) res = "two";
        else if (d == 3) res = "three";
        else if (d == 4) res = "four";
        else if (d == 5) res = "five";
        else if (d == 6) res = "six";
        else if (d == 7) res = "seven";
        else if (d == 8) res = "eight";
        else if (d == 9) res = "nine";
        else res = "Invalid input";

        System.out.println(res);
    }
}