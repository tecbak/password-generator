package ua.rud;

import java.util.Random;

public class PasswordGenerator {
    private final Random random = new Random();
    private final char[] allChars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    public String generate(final int length) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            final char c = getRandomChar();
            builder.append(c);
        }
        return builder.toString();
    }

    private char getRandomChar() {
        final int length = allChars.length;
        final int rnd = random.nextInt(length);
        return allChars[rnd];
    }
}
