package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest extends PracticeTest{
    @ParameterizedTest
    @ValueSource(strings = {
            // positive
            "test@example.com",
            //corner
            "t@t.co"
    })
    public void checkEmailWithValidValuesTest(String email){
        boolean actualResult = practice.isValidEmail(email);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // negative
            "bad@.com", "no-at-symbol"
    })
    public void checkEmailWithNotValidValuesTest(String emails){
        boolean actualResult = practice.isValidEmail(emails);

        assertFalse(actualResult);
    }

    @Test
    public void checkEmailWithNullTest(){
        boolean actualResult = practice.isValidEmail(null);

        assertFalse(actualResult);
    }

}
