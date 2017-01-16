package ua.rud;

import java.util.Scanner;

public class Runner {

    public static final String WELCOME_MESSAGE = "Write a lenght of a password to be generated:";

    public static void main(String[] args) {
        final PasswordGenerator generator = new PasswordGenerator();
        final Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        for (int length = scanner.nextInt(); length > 0; length = scanner.nextInt()) {
            final String password = generator.generate(length);
            System.out.println(password);
        }
    }

}
