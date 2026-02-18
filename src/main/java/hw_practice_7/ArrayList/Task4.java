package hw_practice_7.ArrayList;

import java.util.ArrayList;

public class Task4 {
    private ArrayList<Integer> list = new ArrayList<>();

    public void addNumber(Integer num){
        list.add(num);
    }

    public void printNumbers(){
        list.forEach(System.out::println);
    }

    public void printSumAllNumbers(){
        int sum = 0;
        for (Integer num : list){
            sum = sum + num;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
