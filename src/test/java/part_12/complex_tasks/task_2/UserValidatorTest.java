package part_12.complex_tasks.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * negative case for name:
 * 1) name == null
 * 2) name первая символ нижним регистром
 * 3) name = ""
 * negative case for email:
 * 1) null
 * 2) ""
 * 3) @nsndjd
 * negative case for age:
 * 1) 17
 * 2) 101
 *
 * positive:
 * user with valid data
 */
public class UserValidatorTest {
    UserValidator validator = new UserValidator();

    @BeforeEach
    void setValidateEnabled(){
        UserValidator.validationEnabled = true;
    }

    @Test
    public void testUserWithValidData(){
        User user = new User("Nadya", 26, "test@email.com");

        assertDoesNotThrow(() ->
            validator.userValidate(user));
    }

    @Test
    public void testUserWithEmptyName(){
        User user = new User("", 26, "test@email.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Пустое имя");
    }

    @Test
    public void testUserWithNameIsNull(){
        User user = new User(null, 26, "test@email.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Имя null");
    }

    @Test
    public void testUserWithNameFirstCharIsLowerCase(){
        User user = new User("nadya", 26, "test@email.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Имя с маленькой буквы");
    }

    @Test
    public void testUserAgeLess18Year(){
        User user = new User("Nadya", 17, "test@email.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Возраст меньше 18");
    }

    @Test
    public void testUserAgeMore100Year(){
        User user = new User("Nadya", 101, "test@email.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Возраст больше 100");
    }

    @Test
    public void testUserWithEmailIsNull(){
        User user = new User("Nadya", 26, null);

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Email null");
    }

    @Test
    public void testUserWithEmailIsEmpty(){
        User user = new User("Nadya", 26, "");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Email is empty");
    }
    @Test
    public void testUserWithEmailInvalidValue(){
        User user = new User("Nadya", 26, "jjebfjeb");

        assertThrows(InvalidUserException.class, () -> {
            validator.userValidate(user);
        }, "Email не соответствует шаблону \"test@test.com\"");
    }



}
