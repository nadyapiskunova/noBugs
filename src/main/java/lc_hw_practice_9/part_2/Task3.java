package lc_hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>(Arrays.asList("Peach", "Banana", "Orange"));

        List<Integer> listLength = listStr.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(listLength);
    }
}
