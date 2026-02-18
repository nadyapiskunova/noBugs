package hw_practice_7.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Task5 {
    private final LinkedList<Integer> listInt = new LinkedList<>();


    Random random = new Random();

    public void addRandomNumbers(int size){
        for (int i = 0; i < size; i++){
            listInt.add(random.nextInt(100));
        }
    }
    public void printNumbersList(){
        listInt.forEach(
                number ->{
                    System.out.print(number + " ");
                }
        );
        System.out.println();
        System.out.println();
    }

    public void printNumbersWithIteratorNext(){
        ListIterator<Integer> it = listInt.listIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void printNumbersWithIteratorPrevious(){
        ListIterator<Integer> it = listInt.listIterator(listInt.size());
        while (it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        System.out.println();
    }





}
