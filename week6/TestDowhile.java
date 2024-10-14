package demo1.week6;

import java.util.Scanner;

public class TestDowhile {
    /**
     * Main method
     */

    public static void main(String[] args) {
        int data;
        int sum = 0;
        // Create a Scanner
        Scanner input = new Scanner(System.in);
// Keep reading data until the input is 0
        do{
// Read the next data
            System.out.print("Enter an integer (the input ends if it is 8): ");
        data = input.nextInt();
        sum += data;
    } while(data !=0);
    System.out.println("The sum is "+sum);
}
}