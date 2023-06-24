/* Program 29
Write a program to input a digit and print it in words.
24/06/23 */

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int d = sc.nextInt();
        String res;
        switch (d) {
            case 0: res = "zero"; break;
            case 1: res = "one"; break;
            case 2: res = "two"; break;
            case 3: res = "three"; break;
            case 4: res = "four"; break;
            case 5: res = "five"; break;
            case 6: res = "six"; break;
            case 7: res = "seven"; break;
            case 8: res = "eight"; break;
            case 9: res = "nine"; break;
            default: res = "Invalid input";
        }
        System.out.println(res);
    }
}
