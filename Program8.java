/* Program 8
   Taking the units place digit of a number (u) as 9, tens digit (t) as 0 and the hundreds place digit (h) as 4, write a Java program that uses the mathematical relation of place values of a number to calculate the number.
   09/06/23 */

public class Program008 {
  public static void main() {
    int u = 9, t = 0, h = 4;
    int res = 100 * h + 10 * t + u;
    System.out.println("The number is: " + res);
  }
}
