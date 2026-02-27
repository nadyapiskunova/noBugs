package lc_hw_practice_8.additional_task.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void addNumbers(List<? super Integer> list){
        list.add(11);
        list.add(12);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        addNumbers(list);

        list.forEach(System.out::println);
    }
}
