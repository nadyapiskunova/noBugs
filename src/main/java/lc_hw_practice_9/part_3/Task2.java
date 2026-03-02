package lc_hw_practice_9.part_3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(79,43,5,2,14));

        Optional<Integer> minNumber = numbers.stream().min(Comparator.naturalOrder());

        System.out.println(minNumber.orElse(0));
    }
}
