package hw_practice_8.exceptions.task_4;

import hw_practice_8.exceptions.task_4.exceptions.InvalidEmailExceptions;

import java.util.regex.Pattern;

public class EmailValidator {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public static void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidEmailExceptions("Некорректный email: " + email);
        }

    }
}
