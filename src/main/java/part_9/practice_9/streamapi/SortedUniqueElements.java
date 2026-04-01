package part_9.practice_9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedUniqueElements {
    // список с дублирующими значениями
    // необходимо вывести список в отсортированном порядке
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 4, 2, 5);

        //оригинальный
//        List<Integer> uniqueSorted = numbers.stream()
//                .distinct()
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(uniqueSorted);

        // с логами
        List<Integer> uniqueSorted = numbers.stream()
                .distinct()
                .peek(n -> System.out.println("distinct: " + n))
                .sorted()
                .peek(n -> System.out.println("sorted: " + n))
                .collect(Collectors.toList());

        System.out.println(uniqueSorted);



    }
}
