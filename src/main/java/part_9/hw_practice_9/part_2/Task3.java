package part_9.hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(Arrays.asList("Banana", "Peach", "Apple", "Orange"));

        List<Integer> strLength = str.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(strLength);
    }
}
