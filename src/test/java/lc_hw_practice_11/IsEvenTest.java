package lc_hw_practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends TaskTest{
    @ParameterizedTest
    @ValueSource(ints = {
            // positive
            2, 4,
            // corner
            0, -8
    })
    public void checkEvenWhenNumberEven(int initialNumber){
        boolean actualResult = task.isEven(initialNumber);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            1, 3, -5
    })
    public void checkEvenWhenNumberNotEven(int initialNumberNotEven){
        boolean actualResult = task.isEven(initialNumberNotEven);

        assertFalse(actualResult);
    }
}
