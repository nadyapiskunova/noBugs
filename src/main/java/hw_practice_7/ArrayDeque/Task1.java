package hw_practice_7.ArrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    private ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

    public void addNumbers(Integer num){
        numbers.offer(num);
    }

    public void printNumbers(){
        numbers.forEach(System.out::println);
    }
}
