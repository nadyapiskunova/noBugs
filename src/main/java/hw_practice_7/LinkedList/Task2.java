package hw_practice_7.LinkedList;

import java.util.LinkedList;

public class Task2 {
    private final LinkedList<String> list = new LinkedList<>();

    public void addIssue(String task){
        list.add(task);
    }

    public void printAllIssue(){
        if (list.isEmpty()){
            System.out.println("Список задач пуст!");
            return;
        }
        System.out.println();
        list.forEach(System.out::println);

    }

    public void processIssue(){
        list.poll();
        if (list.isEmpty()){
            System.out.println();
            System.out.println("Задач нет!");
            System.out.println();
        }
    }
}
