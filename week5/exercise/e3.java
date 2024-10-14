package demo1.week5.exercise;
import java.util.Scanner;
public class e3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a letter: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                char letter = input.charAt(0);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    System.out.println("The letter is a vowel.");
                } else {
                    System.out.println("The letter is a consonant.");
                }
            } else {
                System.out.println("Invalid input");
            }

            scanner.close();

    }
}
