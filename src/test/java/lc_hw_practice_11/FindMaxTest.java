package lc_hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends TaskTest{
    public static Stream<Arguments> forFindMaxInArrayWithValidNumber(){
        return Stream.of(
                // positive
                Arguments.of(new int[] {3,5,7,2}, 7),
                //corner
                Arguments.of(new int[] {5}, 5),
                Arguments.of(new int[] {-3,-4,-7}, -3)

        );
    }

    @ParameterizedTest
    @MethodSource("forFindMaxInArrayWithValidNumber")
    public void findMaxInArrayWithValidNumberTest(int[] array, int expectedResult){
        int actualResult = task.findMax(array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMaxInEmptyArrayTest(){
        assertThrows(NoSuchElementException.class, () ->{
            task.findMax(new int[]{});
        }, "Пустой массив выбрасывает исключение NoSuchElementException");
    }
}
