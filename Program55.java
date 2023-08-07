/* Program 55
Design a class to print the sum of the first 10 natural numbers.
07/08/23 */

public class Program55 {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 10)
            sum += i++;
    System.out.println("The sum of the first 10 natural numbers is " + sum);
    }
}