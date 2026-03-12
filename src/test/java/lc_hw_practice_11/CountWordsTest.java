package lc_hw_practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends TaskTest{
    public static Stream<Arguments> forCountWordsTest(){
        return Stream.of(
                // positive
                Arguments.of("hello, world", 2),
                // corner
                Arguments.of("", 0),
                Arguments.of("my   name is  nadya ", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("forCountWordsTest")
    public void countWordsInValideStringTest(String initialStr, int expectedResult){
        int actualResult = task.countWords(initialStr);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void countWordsInNullString(){
        assertThrows(NullPointerException.class, ()->{
            task.countWords(null);
        }, "Null string should lead NullPointerException");
    }
}
