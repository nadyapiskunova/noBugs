package part_9.hw_practice_9.part_3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,43,2,4,30));

         Optional<Integer> maxOfNumber = number.stream()
                .max(Comparator.naturalOrder());
        System.out.println(maxOfNumber.orElse(0));

    }
}
