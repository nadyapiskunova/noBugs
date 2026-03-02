package hw_practice_9.part_3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(32,56,21,567,4,98));

        Optional<Integer> minOfNumber = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println(minOfNumber.orElse(0));
    }
}
