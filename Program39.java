/* Program 39
Design a class to print the sum of the first 10 even numbers.
24/07/23 */

public class Program39 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i * 2;
        
        System.out.println("The sum of the first 10 even numbers is " + sum);
    }
}