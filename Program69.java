/* Program 69
Write a program to print odd numbers from 99 to 80.
21/08/23 */

public class Program69 {
    public static void main(String[] args) {
        int i = 99;
        do {
            System.out.println(i);
            i -= 2;
        } while (i > 80);
    }
}