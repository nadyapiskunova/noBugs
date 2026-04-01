package part_9.lc_hw_practice_9.part_1;

import java.util.function.Consumer;

public class Task5 {
    public static void main(String[] args) {
        Consumer<String> printString = str -> System.out.println(str);

        printString.accept("java");
    }
}
