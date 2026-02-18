package lc_hw_practice_7.hashSet;

import java.util.Arrays;
import java.util.HashSet;

public class Task1 {

    private HashSet<Integer> numbers = new HashSet<>(
            Arrays.asList(1,53,24,85,23)
    );

    public void printNumbers(){
        numbers.forEach(System.out::println);
    }
}
