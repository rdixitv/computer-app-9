/* Program 92
Write a program to enter the roll number, name, class and marks in 10 subjects belonging to a class of 25 students. Calculate and print the average scored by each student.
31/10/23 */

import java.util.Scanner;

public class Program92 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rollno = 0, grade = 0;
    String name = "";
    double sum = 0;

    for (int i = 1; i <= 3; i++) {
      System.out.print("Enter roll number: ");
      rollno = sc.nextInt();
      System.out.print("Enter name: ");
      name = sc.next();
      System.out.print("Enter class: ");
      grade = sc.nextInt();
      
      for (int j = 1; j <= 10; j++) {
        System.out.print("Enter subject " + j + " marks: ");
        sum += sc.nextDouble();
      }
      System.out.println(rollno + ". " + name + "\nClass - " + grade + "\nAvg - " + sum / 10 + "\n");
      sum = 0;
    }
  }
}
