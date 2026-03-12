package hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMax extends PracticeTest{
    public static Stream<Arguments> argumentsForValidValueTest(){
        return Stream.of(
                // positive
                Arguments.of(new int[] {1,2,32,5,6,9}, 9),
                // corner
                Arguments.of(new int[] {1,5,4,5}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsForValidValueTest")
    public void findSecondMaxInArrayWithValidValueTest(int[] array, int expectedResult){
        int actualResult = practice.findSecondMax(array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findSecondMaxInArrayHasOneNumberTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            practice.findSecondMax(new int[] {1});
        }, "Array with one number should lead to IllegalArgumentException");
    }
}
