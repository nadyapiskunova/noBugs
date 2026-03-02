package lc_hw_practice_9.part_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>(Arrays.asList("Peach", "Pie", "Banana", "Watermelon"));

        List<String> filterListStr = listStr.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(filterListStr);

    }
}
