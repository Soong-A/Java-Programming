package demo1.week5;

public class FormatDemo {
    public static void main (String[] args) {
        System.out.printf("%-105%-10s%-10s%-105%-10s \n" , "Degrees", "Radians",
        "Sine", "Cosine", "Tangent");
// Display values for 30 degree
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.46%-10.4f%-10.4f\n", degrees, radians,Math.sin(radians), Math.cos(radians), Math.tan(radians));
// Display values for 60 degree
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians,
                Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }
}
