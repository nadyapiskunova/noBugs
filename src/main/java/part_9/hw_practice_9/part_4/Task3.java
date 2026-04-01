package part_9.hw_practice_9.part_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3));

       Double aveNumber =  number.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(aveNumber);
    }
}
