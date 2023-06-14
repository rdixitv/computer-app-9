/* Program 7
 Write a Java program that prints the commuted kinetic energy by the formula KE = (1/2)mv^2 where m = 4.5kg, v = 10m/s.
 09/06/23 */

public class Program7 {
  public static void main() {
    double m = 4.5;
    int v = 10;
    double ke = 1.0 / 2 * m * v * v;
    System.out.println("Kinetic energy = " + ke);
  }
}
