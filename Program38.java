/* Program 38
Design a class to print the sum of the first 10 natural numbers.
21/07/23 */

public class Program38 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;

        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}