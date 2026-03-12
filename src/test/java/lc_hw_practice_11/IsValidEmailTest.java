package lc_hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends TaskTest{
    @ParameterizedTest
    @ValueSource(strings = {
            //positive
            "test@example.com",
            //corner
            "t@e.co"
    })
    public void checkEmailWithValidValueTest(String email){
        boolean actualResult = task.isValidEmail(email);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            //negative
            "bad@.com", "no-at-symbol",
    })
    public void checkIsValidEmailWithNotValidValueTest(String email){
        boolean actualResult = task.isValidEmail(email);

        assertFalse(actualResult);
    }

    @Test
    public void checkIsValidEmailWithNull(){
        boolean actualResult = task.isValidEmail(null);

        assertFalse(actualResult);
    }
}
