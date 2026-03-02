package hw_practice_9.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Яблоко", "Банан", "Киви", "Бидон"));

        Optional<String> findFirstWithB = list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();
        System.out.println(findFirstWithB);
    }
}
