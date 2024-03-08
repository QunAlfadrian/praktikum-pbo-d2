package tugas_3;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        UserInputValidator.validateUsername(username);

        System.out.println("User registration complete");
    }
}
