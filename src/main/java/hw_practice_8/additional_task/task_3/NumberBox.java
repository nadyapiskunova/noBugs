package hw_practice_8.additional_task.task_3;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number>{

    private List<T> listNumbers = new ArrayList<>();

     public void addNumber(T number){
        listNumbers.add(number);
    }

    public double printSumNumbers(){
        System.out.println("Сумма чисел: ");
        double sum = 0.0;
        for (T number : listNumbers){
            sum += number.doubleValue();
        }
        return sum;
    }
}
