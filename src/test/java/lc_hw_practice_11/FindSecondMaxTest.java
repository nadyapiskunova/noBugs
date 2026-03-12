package lc_hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends TaskTest{
    public static Stream<Arguments> forValidArrayTest(){
        return Stream.of(
                // positive
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 4),
                // corner
                Arguments.of(new int[] {1, 2, 2, 3, 5}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("forValidArrayTest")
    public void findSecondsMaxInValidArrayTest(int[] array, int expectedResult){
        int actualResult = task.findSecondMax(array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findSecondsMaxWithOneNumberArrayTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            task.findSecondMax(new int[] {1});
        }, "Поиск второго максимального значение в массив с одним элементом выбрасывает IllegalArgumentException");
    }
}
