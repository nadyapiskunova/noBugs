package lc_hw_practice_7.linkedHashSet;

import java.util.LinkedHashSet;

public class Task2 {
    private LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();

    public void addNumbers(Integer number){
        numbers.add(number);
    }

    public void printNumbers(){
        numbers.forEach(
                number -> {
                    System.out.print(number + " " );
                }
        );
    }
}
