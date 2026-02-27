package hw_practice_8.additional_task.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void addNumber(List<? super Integer> list){
        list.add(3);
        list.add(2);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,4,5));
        addNumber(list);

        list.forEach(System.out::println);

    }
}
