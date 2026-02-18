package lc_hw_practice_7.linkedList;

import java.util.*;

public class Task5 {
    private LinkedList<Integer> numbers = new LinkedList<Integer>(
            Arrays.asList(14,13,65,24,13,54,12,35,31)
    );

    public void printNumberNext(){
        ListIterator<Integer> it = numbers.listIterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();
    }

    public void printNumbersPrevious(){
        ListIterator<Integer> it = numbers.listIterator(numbers.size());

        while (it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
        System.out.println();
    }


}
