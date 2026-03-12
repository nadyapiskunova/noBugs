package hw_practice_11;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsLeapYear extends PracticeTest {

    @ParameterizedTest
    @ValueSource( ints = {
            // positive
            2020, 2000, 1600
    })
    public void checkIsLeapYearWhenYearIsLeapTest(int year){
        boolean actualResult = practice.isLeapYear(year);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            // не високосный год
            2025, 2019,
            // делится на 100, но не на 400
            1900, 2100
    })
    public void checkIsLeapYearWhenYearIsNotLeapTest(int year){
        boolean actualResult = practice.isLeapYear(year);

        assertFalse(actualResult);
    }




}
