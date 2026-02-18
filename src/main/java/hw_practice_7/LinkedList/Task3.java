package hw_practice_7.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task3 {
    private final LinkedList<String> list = new LinkedList<>(Arrays.asList("Первая", "Вторая", "Третья", "Четвертая", "Последняя"));

    public void printList(){
        list.forEach(System.out::println);
    }

    public void printFirstAndLastString(){
        System.out.println("Первая строка в списке: " + list.getFirst());
        System.out.println("Последняя строка в списке: " + list.getLast());
    }


}
