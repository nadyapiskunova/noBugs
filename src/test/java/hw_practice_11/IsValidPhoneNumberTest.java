package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidPhoneNumberTest extends PracticeTest{
    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890"
    })
    public void checkValidPhoneNumberWithValidValueTest(String phoneNumber){
        boolean actualResult = practice.isValidPhoneNumber(phoneNumber);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "12345",
            "invalid"
    })
    public void checkValidPhoneNumberWithNotValidValueTest(String phoneNumber){
        boolean actualResult = practice.isValidPhoneNumber(phoneNumber);
        assertFalse(actualResult);
    }
}
