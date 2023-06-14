/* Program 13
Write a program in Java to assign a number. If the number is even, print its square, otherwise, print its cube.
12/06/23 */

public class Program13 {
    public static void main() {
        int num = 3;
        int res = num % 2 == 0 ? num * num : num * num * num;
        System.out.println("The result is " + res);
    }
}