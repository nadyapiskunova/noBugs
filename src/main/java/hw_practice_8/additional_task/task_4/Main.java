package hw_practice_8.additional_task.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        Task4 task4 = new Task4();

        task4.calculateSumNumbers(list);

    }
}
