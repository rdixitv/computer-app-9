/* Program 11
Write a program to assign to the variable length and breadth and print if it is a square or a rectangle.
12/06/23 */

public class Program11 {
    public static void main() {
        double breadth = 11.0, length = 9.8;
        String res = length == breadth ? "square" : "rectangle";
        System.out.println("The shape is a " + res);
    }
}