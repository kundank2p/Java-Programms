import java.util.Scanner;

public class LastNameFirstName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the full name
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        // Split the full name into first name and last name
        String[] names = fullName.split(" ");
        String firstName = "";
        String lastName = "";

        // Extracting the last name and first name
        if (names.length > 0) {
            lastName = names[names.length - 1];
            for (int i = 0; i < names.length - 1; i++) {
                firstName += names[i] + " ";
            }
            // Removing extra space from the end of first name
            firstName = firstName.trim();
        } else {
            System.out.println("Invalid name entered.");
            return;
        }

        // Printing the last name followed by the first name
        System.out.println("Last Name First: " + lastName + ", " + firstName);

        scanner.close();
    }
}
