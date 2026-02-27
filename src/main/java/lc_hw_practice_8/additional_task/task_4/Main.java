package lc_hw_practice_8.additional_task.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void calculateSum(List <? extends Number> list){
        double sum = 0;
        for (Number number : list){
            sum += number.doubleValue();
        }
        System.out.println("Сумма элементов: " + sum);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        calculateSum(list);

    }
}
