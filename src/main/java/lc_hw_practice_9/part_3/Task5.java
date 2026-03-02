package lc_hw_practice_9.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 7));

        boolean findEvenNumber = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(findEvenNumber);
    }
}
