package hw_practice_7.HashSet;

import java.util.HashSet;

public class Task2 {
    private final HashSet<Integer> numbers = new HashSet<>();

    public void addNumber(int number){
        numbers.add(number);
    }
    public void printNumber(){
        numbers.forEach(
                number ->{
                    System.out.print(number + " ");
        }
        );
    }
}
