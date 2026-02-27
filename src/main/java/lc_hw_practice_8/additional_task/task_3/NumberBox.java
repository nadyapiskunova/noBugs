package lc_hw_practice_8.additional_task.task_3;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number>{

    private List<T> list = new ArrayList<>();

    public void addNumber(T number){
        list.add(number);
    }

    public void printSumNumber(){
        double sum = 0;
        for (T num : list){
            sum += num.doubleValue();
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
