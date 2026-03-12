package lc_hw_practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversTest extends TaskTest{
    public static Stream<Arguments> argumentsForReverseTest(){
        return Stream.of(
                // postive
                Arguments.of("java", "avaj"),
                //corner
                Arguments.of("", ""),
                Arguments.of("j", "j"),
                Arguments.of(null, null)
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForReverseTest")
    public void reverseString(String initialStr, String expectedResult){
        String actualResult = task.reverse(initialStr);

        assertEquals(expectedResult, actualResult);
    }

}
