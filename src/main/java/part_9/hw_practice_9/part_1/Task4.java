package part_9.hw_practice_9.part_1;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;

        System.out.println(strLength.apply("Hello"));
    }
}
