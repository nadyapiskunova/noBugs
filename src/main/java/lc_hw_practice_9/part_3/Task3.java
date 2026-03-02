package lc_hw_practice_9.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));

        int sumNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumNumbers);
    }
}
