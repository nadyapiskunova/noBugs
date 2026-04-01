package part_9.lc_hw_practice_9.part_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Апельсин", "Банан", "Баклажан", "Виноград", "Киви"));

        Optional<String> findFirstStringWithCharB = list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        System.out.println(findFirstStringWithCharB);
    }
}
