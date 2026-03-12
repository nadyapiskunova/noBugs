package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsIvenTest extends PracticeTest{

    @ParameterizedTest
    @ValueSource ( ints = {
            // positive path
            2,
            // corner
            0, -2
    })
    public void checkIsIvenNumberWithEvenNumbers(int evenNumber){
        boolean actualResult = practice.isEven(evenNumber);

        assertTrue(actualResult);
    }
    @ParameterizedTest
    @ValueSource ( ints = {
            // positive path
            1,
            // corner
            -1
    })
    public void checkIsIvenNumberWithNotEvenNumbers(int notEvenNumber){
        boolean actualResult = practice.isEven(notEvenNumber);

        assertFalse(actualResult);
    }
}
