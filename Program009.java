/* Program 9
Write a program to assign a value to the variable age and print if the person is a major or minor.
12/06/23 */

public class Program9 {
    public static void main() {
        int age = 20;
        String res = age >= 18 ? "major" : "minor";
        System.out.println("The person is a " + res);
    }
}