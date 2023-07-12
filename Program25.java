/* Program 25
Write a program to input marks of a student and print
Excellent - >90
Good      - >80
Fair      - >70
Average   - >60
Poor      - <=60
19/06/23 */

import java.io.*;

public class Program25 {
  public static void main() throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    System.out.print("Enter the student's marks: ");
    int marks = Integer.parseInt(br.readLine());

    String res;
    if (marks > 100 || marks < 0)
      res = "invalid";
    else if (marks > 90)
      res = "excellent";
    else if (marks > 80)
      res = "good";
    else if (marks > 70)
      res = "fair";
    else if (marks > 60)
      res = "average";
    else
      res = "poor";
    System.out.printf("The marks are %s.%n", res);
  }
}
