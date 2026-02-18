package lc_hw_practice_7.linkedList;

import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> tasks = new LinkedList<String>();

    public void addTask(String nameTask){
        tasks.add(nameTask);
    }

    public void printTasks(){
        if(tasks.isEmpty()){
            System.out.println("Список задач пуст!");
            return;
        }
        tasks.forEach(System.out::println);
        System.out.println();
    }

    public void processTask(){
        if(tasks.isEmpty()){
            System.out.println("Нет задач для обработки!");
            return;
        }
        tasks.poll();
        System.out.println();
    }

}
