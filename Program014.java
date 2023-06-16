/* Program 14
Write a program to assign a value to marks and print
Excellent - >90
Good      - >80
Fair      - >70
Average   - >60
Poor      - <=60
12/06/23 */

public class Program014 {
    public static void main() {
        int marks = 100;
        String res = marks > 90 ? "excellent" :
                     marks > 80 ? "good" :
                     marks > 70 ? "fair" :
                     marks > 60 ? "average" : "poor";
        System.out.println("The marks are " + res);
    }
}