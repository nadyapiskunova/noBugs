package practice_9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        // 1. Создать список целых чисел, отфильтровать четные числа, суммировать их
        // промежуточная: фильтрация по четности
        // терминальная: суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

//        оригинальный метод

//       int sum = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                // если обращаемся к методу и передаем ему n как параметр, то
//                // запись "n -> Integer.valueOf(n)" сокращается до "Integer::valueOf"
//                .mapToInt(Integer::valueOf)
//                .sum();
//        System.out.println(sum);

        // метод с логами
        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n-> {
                    System.out.println("mapToInt: " + n);
                    return Integer.valueOf(n);
                });

        System.out.println("Stream создан, но терминальный метод еще не вызван");

        int sum = stream.sum();

        System.out.println(sum);
    }
}
