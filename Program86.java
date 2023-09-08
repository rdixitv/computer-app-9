/* Program 86
Write a program to print the following pattern using nested loops:
@@@@
@@@@
@@@@
@@@@
08/09/23 */

public class Program86 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}