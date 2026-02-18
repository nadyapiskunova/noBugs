package lc_hw_practice_7.treeSet;

import java.util.Arrays;
import java.util.TreeSet;

public class Task1 {
    private TreeSet<Integer> numbers = new TreeSet<Integer>(Arrays.asList(15,1,6,3,10));

    public void printNumber(){
        numbers.forEach(
                number -> {
                    System.out.print(number + " ");
                }
        );
    }
}
