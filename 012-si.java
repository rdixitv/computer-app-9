/* Program 12
Write a program to assign values to variables principle and time. If time is more than 2 years, calculate and print the simple interest with rate 8% else calculate with rate 12%.
12/06/23 */

public class Program12 {
    public static void main(String[] args) {
        double principle = 2304.5;
        double time = 3.0;
        int rate = time > 2.0 ? 8 : 12;
        double si = (principle * time * rate) / 100;
        System.out.println("The simple interest is " + si);
    }
}