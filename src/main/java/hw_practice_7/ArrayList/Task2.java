package hw_practice_7.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {

    private ArrayList<Integer> numbers = new ArrayList<>();

    Random random = new Random();

    public void createRandomNumbers(Integer size){
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printAllNumbers(){
        System.out.print("Все числа: ");
        numbers.forEach(
                number -> System.out.print(number + " ")
        );

    }

    public void printEvenNumbers(){
        System.out.println();
        System.out.print("Четные числа: ");
        numbers.forEach(
                number ->{
                    if (number % 2 == 0){
                        System.out.print(number + " ");
                    }
                }
        );
    }





}
