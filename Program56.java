/* Program 56
Design a class to print the sum of the first 10 even numbers.
14/08/23 */

public class Program56 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10)
            sum += i++ * 2;

        System.out.println("The sum of the first 10 even numbers is " + sum);
    }
}