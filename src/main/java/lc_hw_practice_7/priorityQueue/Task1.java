package lc_hw_practice_7.priorityQueue;

import java.util.PriorityQueue;

public class Task1 {
    private PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();

    public void addNumber(Integer number){
        numbers.offer(number);
    }

    public void printInRemove(){
        while (!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
