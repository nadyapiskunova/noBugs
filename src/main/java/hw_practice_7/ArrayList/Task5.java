package hw_practice_7.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    final private ArrayList<Integer> numbers = new ArrayList<>();

    Random random = new Random();

    public void createNumberRandomList(Integer size){
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printListNumbers(){
        numbers.forEach(
                number -> {
                    System.out.print(number + " ");
                }
        );
        System.out.println();
    }

    public void printMaxNumber(){
        int max = 0;

        for ( Integer number : numbers){
            if (number > max){
                max = number;
            }
        }
        System.out.print("Максимальное число: " + max);
    }
}
