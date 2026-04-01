package part_9.lc_hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(11,13,15,25,60,93,55));

        List<Integer> filterNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filterNumbers);
    }
}
