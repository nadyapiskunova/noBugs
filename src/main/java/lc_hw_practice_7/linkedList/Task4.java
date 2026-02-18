package lc_hw_practice_7.linkedList;

import java.util.LinkedList;
import java.util.Random;

public class Task4 {
    private LinkedList<Integer> numbers = new LinkedList<Integer>();

    Random random = new Random();

    public void addSizeForListNumbers(int size){
        for(int i = 1; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printNumbers(){
        numbers.forEach(
                num ->{
                    System.out.print(num + " ");
                }
        );
        System.out.println();
    }

    public void printSumNumber(){
        int sum = 0;

        for (Integer number : numbers){
            sum += number;
        }
        System.out.println("Сумма элементов в списке: " + sum);
        System.out.println();
    }
}
