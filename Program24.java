/* Program 24
Write a program to print whether a given character is a digit or a letter.
19/06/23 */

import java.io.*;

public class Program24 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter a character: ");
        char ch = br.readLine().charAt(0);

        if (ch >= '0' && ch <= '9')
            System.out.println("It is a digit.");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("It is an uppercase character.");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("It is a lowercase character.");
        else
            System.out.println("Invalid input");
    }
}
