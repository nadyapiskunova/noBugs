package lc_hw_practice_7.treeSet;

import java.util.TreeSet;

public class Task2 {
    private TreeSet<Integer> numbers = new TreeSet<Integer>();

    public void addNumbers(Integer number){
        numbers.add(number);
    }

    public void printNumbers(){
        numbers.forEach(
                numbers ->{
                    System.out.print(numbers + " ");
                }
        );
    }
}
