package hw_practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest extends PracticeTest {
    public static Stream<Arguments> inputForReverseStringTest(){
        return Stream.of (
                // positive
                Arguments.of("hello", "olleh"),
                // corner
                Arguments.of("", ""),
                Arguments.of("h", "h"),
                Arguments.of(null, null)

        );

    }

    @ParameterizedTest
    @MethodSource("inputForReverseStringTest")
    public void reverseStringTest(String initialInput, String expectedInput){
        String actualInput = practice.reverse(initialInput);

        assertEquals(expectedInput, actualInput);
    }






}
