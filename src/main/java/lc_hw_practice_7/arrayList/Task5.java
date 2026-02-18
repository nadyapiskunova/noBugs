package lc_hw_practice_7.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    Random random = new Random();

    public void addSizeNumberList(int size){
        for (int i = 1; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printNumbers(){
        numbers.forEach(
                num -> {
                    System.out.print(num + " ");
                }
        );
        System.out.println();
    }

    public void printMaxNumber(){
        Integer maxNumber = numbers.getFirst();

         for (Integer number : numbers){
             if (maxNumber < number){
                 maxNumber = number;
             }
         }
        System.out.println("Максимальное число в списке: " + maxNumber);
        System.out.println();
    }
}
