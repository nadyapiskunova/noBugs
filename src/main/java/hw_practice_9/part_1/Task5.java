package hw_practice_9.part_1;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<String> printString = System.out::println;

        printString.accept("Java");
    }

}
