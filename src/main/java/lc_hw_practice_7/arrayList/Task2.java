package lc_hw_practice_7.arrayList;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();

     Random random = new Random();

    public void addSizeRandomNumbersList(int size){
        for (int i = 1; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printAllNumbers(){
        numbers.forEach(
                num ->{
                    System.out.print(num + " ");
                }
        );

        System.out.println();
    }

    public void printEvenNumber(){
        for(Integer num : numbers){

            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
