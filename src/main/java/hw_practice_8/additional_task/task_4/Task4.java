package hw_practice_8.additional_task.task_4;

import java.util.List;

public class Task4 {
    public void calculateSumNumbers (List<? extends Number> list){
        double sum = 0.0;
        for (Number number : list){
            sum += number.doubleValue();
        }
        System.out.println("Сумма чисел: " + sum);

    }
}
