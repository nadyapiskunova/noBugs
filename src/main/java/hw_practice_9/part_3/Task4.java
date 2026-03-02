package hw_practice_9.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));


        int sumOfNumberList = numbers.stream()
                .mapToInt(Integer::shortValue)
                .sum();
        System.out.println(sumOfNumberList);

    }
}
