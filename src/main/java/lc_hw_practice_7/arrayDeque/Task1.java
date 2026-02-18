package lc_hw_practice_7.arrayDeque;

import java.util.ArrayDeque;

public class Task1 {
    private ArrayDeque<Integer> numbers = new ArrayDeque<Integer>();

    public void addNumber(Integer number){
        numbers.add(number);
    }

    public void printNumbers(){
        numbers.forEach(System.out::println);
    }
}
