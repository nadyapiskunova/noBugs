package hw_practice_7.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    private ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void addNum(Integer num){
        numbers.add(num);
    }

    public void printNumbers(){
        System.out.println();
        numbers.forEach(System.out::println);
    }



}
