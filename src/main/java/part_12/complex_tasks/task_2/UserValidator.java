package part_12.complex_tasks.task_2;

import java.util.regex.Pattern;

public class UserValidator {
    public static boolean validationEnabled;
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public void userValidate(User user){
        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    private void validateName(String name) throws InvalidUserException {
        if(name == null || name.isEmpty()) {
            throw new InvalidUserException("Имя не должно быть пустым или null");
        }
        if (!Character.isUpperCase(name.charAt(0))){
            throw new InvalidUserException("Имя должно быть с заглавной буквы");
        }
    }

    private void validateAge(int age) throws InvalidUserException{
        if(age < 18 || age > 100){
            throw new InvalidUserException("Возраст должен быть больше или равен 18 или меньше или равно 100");
        }
    }

    private void validateEmail(String email) throws InvalidUserException {
        if (email == null || email.isEmpty() || !EMAIL_PATTERN.matcher(email).matches()){
            throw new InvalidUserException(
                    "Email не может быть пустым или null, email должен сооветствовать стандарту \"test@test.test \""
            );
        }

    }
}
