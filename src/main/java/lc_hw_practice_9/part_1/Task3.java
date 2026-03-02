package lc_hw_practice_9.part_1;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<Integer> checkEven = number -> number % 2 == 0;

        System.out.println(checkEven.test(3));
        System.out.println(checkEven.test(4));
    }
}
