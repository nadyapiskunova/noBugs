package lc_hw_practice_9.part_3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 34, 65, 5223, 87));

        Optional<Integer> maxNumber = numbers.stream()
                .max(Comparator.naturalOrder());
        System.out.println(maxNumber.orElse(0));
    }
}
