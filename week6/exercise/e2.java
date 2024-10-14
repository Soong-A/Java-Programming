package demo1.week6.exsercise;

import java.util.Scanner;

public class e2 {
    public static int findGCD(int a, int b) {
        while (b!= 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        int gcd = findGCD(num1, num2);
        System.out.println("The greatest common divisor of these two numbers is: " + gcd);
    }
}
