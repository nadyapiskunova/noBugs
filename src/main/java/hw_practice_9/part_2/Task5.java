package hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> element = new ArrayList<>(Arrays.asList("Peach", "Banana", "Apple", "Peach", "Banana", "Orange"));

        List<String> uniqueElement = element.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueElement);
    }
}
