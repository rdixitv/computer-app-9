/* Program 10
Write a program to assign a class to the variable standard and print 'high school' if class 8 and above and middle school if under 8.
12/06/23 */
public class Program10 {
    public static void main() {
        int standard = 9;
        String res = standard >= 8 ? "high school" : "middle school";
        System.out.println(res);
    }
}