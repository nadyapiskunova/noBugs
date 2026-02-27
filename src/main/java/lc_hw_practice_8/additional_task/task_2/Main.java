package lc_hw_practice_8.additional_task.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <T> void printList(List<T> list){
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Peach", "Banana"));

        printList(list);

    }
}
