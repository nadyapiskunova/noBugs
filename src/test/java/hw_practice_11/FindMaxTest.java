package hw_practice_11;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends PracticeTest {
     static public Stream<Arguments> valueForFindMaxTest(){
         return Stream.of(
                 // positive
                 Arguments.of(new int[]{1, 2, 3}, 3),
                 // corner
                 Arguments.of(new int[]{1}, 1),
                 Arguments.of(new int[]{-1, -2, -3}, -1)
        );
     }
    @ParameterizedTest
    @MethodSource("valueForFindMaxTest")
    public void findMaxInArrayWithElementsTest(int[] array, int expectedNumber){
         int actualNumber = practice.findMax(array);
         assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void findMaxInEmptyArray(){
         assertThrows(NoSuchElementException.class, () -> {
             practice.findMax(new int [] {});
         }, "Empty array should lead to NoSuchElementException");
    }

}
