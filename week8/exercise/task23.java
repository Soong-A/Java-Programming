package demo1.week8.exercise;
import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Numbers in reverse order:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " 1 2 ");
        }
    }
}