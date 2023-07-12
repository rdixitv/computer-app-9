/* Program 37
Write a program to print first n odd numbers.
08/07/23 */
import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of odd numbers to be printed: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 2; i += 2)
            System.out.println(i);
    }
}