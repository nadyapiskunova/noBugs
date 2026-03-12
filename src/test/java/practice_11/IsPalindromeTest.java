package practice_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest extends StringProcessorTest{
    /**
     * Тесты для проверки является ли палиндромом:
     * позитивные кейсы:
     * - четное количество: "abba" -> true
     * - нечетное количество: "хах" -> true
     * негативные кейсы:
     * - "john" -> false
     * corner cases:
     * - "a" -> true
     * - "" -> true
     * - null -> Ille
     */
    @ParameterizedTest
    @ValueSource ( strings = {
            // позитивные кейсы:
            "abba", "хах",
            // corner cases:
            "a", ""
    })
    public void userCanCheckIfValidStringIsPalindrome(String initialString){
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);


    }
    @Test
    public void userCanCheckIfStringIsNotPalindrome(){
        String initialString = "john";

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotReverseNullStringIsPalindrome(){
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.reverse(null);
        }, "Checking if Null is palindrome string should lead to IllegalArgumentException");
    }

}
