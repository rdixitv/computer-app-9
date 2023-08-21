/* Program 73
Design a class to print the sum of the first 10 even numbers.
21/08/23 */

public class Program73 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i++ * 2;
        } while (i <= 10);

        System.out.println("The sum of the first 10 even numbers is " + sum);
    }
}