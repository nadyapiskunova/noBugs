package hw_practice_7.LinkedList;

import java.util.LinkedList;

public class Task4 {
    private final LinkedList<Integer> numbers = new LinkedList<>();

    public void addNumber(Integer number){
        numbers.add(number);
    }

    public void printAllNumbers(){
        numbers.forEach(System.out::println);
    }
    public void printSumAllNumbers(){
        int sum = 0;
        for(Integer num : numbers){
            sum += num;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
