package lc_hw_practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends TaskTest{
    @ParameterizedTest
    @ValueSource(ints = {
            // positive
            2025,2023,
            // corner (делятся на 100, но не делятся на 400)
            1900, 2100
    })
    public void checkIsLeapYearWithNotLeapYear(int year){
        boolean actualResult = task.isLeapYear(year);

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            2024,2020
    })
    public void checkIsLeapYearWithLeapYear(int year){
        boolean actualResult = task.isLeapYear(year);

        assertTrue(actualResult);
    }
}
