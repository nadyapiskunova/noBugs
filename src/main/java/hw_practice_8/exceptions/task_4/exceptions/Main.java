package hw_practice_8.exceptions.task_4.exceptions;

import hw_practice_8.exceptions.task_4.EmailValidator;

public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        emailValidator.validateEmail("enkcncnl");
    }
}
