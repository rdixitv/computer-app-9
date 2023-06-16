/* Program 20
Write a program to input principle amount and time. If the time is more than 2 years, calculate the simple interest with rate 8%, otherwise calculate it with reate 12% per annum.
16/06/23 */

import java.io.*;

public class Program020 {
    public static void main() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the principle amount: ");
        double p = Double.parseDouble(br.readLine());

        System.out.print("Enter the time: ");
        int t = Integer.parseInt(br.readLine());
        double si;
        if (t > 2) si = (p * 8 * t) / 100;
        else si = (p * 8 * t) / 100;

        System.out.println("The interest is " + si);
    }
}