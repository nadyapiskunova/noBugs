package complex_tasks.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();
    @BeforeEach
    void enableValidation(){
        UserValidator.validationEnabled = true;
    }

    @Test
    public void userWithValidData(){
        User nadya = new User("Nadya", 26, "nadya@email.com");

        assertDoesNotThrow(() -> userValidator.validateUser(nadya));
    }

    @Test
    public void userWithEmptyName(){
        User nadya = new User("", 26, "nadya@email.com");

        assertThrows(InvalidUserException.class,() ->{
            userValidator.validateUser(nadya);
        });
    }

    @Test
    public void userWithNullName(){
        User nadya = new User(null, 26, "nadya@email.com");
        assertThrows(InvalidUserException.class,() ->{
            userValidator.validateUser(nadya);
        });
    }

    @Test
    public void userWithAgeLess18(){
        User nadya = new User("Nadya", 17, "nadya@email.com");
         assertThrows(InvalidUserException.class,() -> {
             userValidator.validateUser(nadya);
         });
    }

    @Test
    public void userWithAgeMore100(){
        User nadya = new User("Nadya", 101, "nadya@email.com");
        assertThrows(InvalidUserException.class,() -> {
            userValidator.validateUser(nadya);
        });
    }
    @Test
    public void userWithInvalidEmail(){
        User nadya = new User("Nadya", 26, "@email.com");
        assertThrows(InvalidUserException.class,() -> {
            userValidator.validateUser(nadya);
        });
    }
}
