import java.util.Scanner;
public class ComputerAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double raduis = input.nextDouble();
        double area = raduis * raduis * PI;
        System.out.println("The area for the circle of radius "+ raduis+" is "+area);
    }
}
