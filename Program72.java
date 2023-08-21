/* Program 72
Design a class to print the sum of the first 10 natural numbers.
21/08/23 */

public class Program72 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        do {
            sum += i++;
        } while (i <= 10);
    System.out.println("The sum of the first 10 natural numbers is " + sum);
    }
}