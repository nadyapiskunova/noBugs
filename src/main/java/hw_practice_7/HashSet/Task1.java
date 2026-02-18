package hw_practice_7.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {
    private final HashSet<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5));

    public void printNumbersSet(){
        numbers.forEach(
                num ->{
                    System.out.print(num + " ");
                }
        );
    }
}
