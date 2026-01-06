import java.util.Scanner;

public class InputHelper {

    public static int enterOption(Scanner scanner, int min, int max) {
        int option;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid Input. Please Ensure That You Enter A Number From " + min + " To " + max + ".");
                scanner.next(); // clear invalid input
            }

            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (option < min || option > max) {
                System.out.println("Invalid Input. Please Ensure That You Enter A Number From " + min + " To " + max + ".");
            }

        } while (option < min || option > max);

        return option;
    }
}