package lc_hw_practice_7.arrayList;

import java.util.ArrayList;

public class Task4 {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public void addNumber(Integer num){
        numbers.add(num);
    }

    public void printSumAllNumbers(){
        int sum = 0;
        for (Integer num : numbers){
            sum += num;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
