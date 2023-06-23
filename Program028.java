/* Program 28
Write a program to print the bill for the electricity office after entering the previous month's reading and the current month's meter reading. Calculate the bill as follows:
<= 80 units      -> Rs. 250
> 80 and <= 150  -> Rs. 2.00 for each extra unit
> 150 and <= 250 -> Rs. 3.00 for each extra unit
< 250            -> Rs. 5.00 for each extra unit
23/06/23 */

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the previous reading: ");
        double prev = sc.nextDouble();
        System.out.print("Enter the current reading: ");
        double current = sc.nextDouble();

        double u = current - prev;
        double cost;
        if (u <= 80)
            cost = 250;
        else if (u > 80 && u <= 150)
            cost = 250 + (u - 80) * 2;
        else if (u > 150 && u <= 250)
            cost = 390 + (u - 150) * 3;
        else
            cost = 690 + (u - 250) * 5;
        System.out.println("The cost is " + cost);
    }
}