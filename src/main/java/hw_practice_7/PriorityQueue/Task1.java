package hw_practice_7.PriorityQueue;

import java.util.PriorityQueue;


public class Task1 {
    private PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();

    public void addNumbers(Integer num){
        numbers.add(num);
    }
    public void printInRemovalOrder(){
       while (!numbers.isEmpty()){
           System.out.println(numbers.poll());
       }
    }
}
