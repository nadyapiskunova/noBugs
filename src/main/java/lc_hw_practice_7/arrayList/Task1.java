package lc_hw_practice_7.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    private ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(12,54,22,63,74));

    public void addNumber(Integer num){
        numbers.add(num);
    }

    public void printNumbers(){
        numbers.forEach(System.out::println);
    }
}
