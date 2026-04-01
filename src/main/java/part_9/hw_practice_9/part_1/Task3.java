package part_9.hw_practice_9.part_1;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(3));

    }
}
