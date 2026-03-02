package lc_hw_practice_9.part_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
                "Абрикос", "Виноград", "Арбуз", "Дыня", "Вишня", "Киви", "Манго", "Кокос"
        ));

        Map<Character, List<String>> listGroupByFirstChar = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.toList()));

        System.out.println(listGroupByFirstChar);
    }
}
