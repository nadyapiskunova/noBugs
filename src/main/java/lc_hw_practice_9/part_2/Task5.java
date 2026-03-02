package lc_hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana", "Peach", "Banana", "Peach", "Orange", "Melon"));

        List<String> uniqueList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueList);
    }
}
