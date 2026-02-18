package lc_hw_practice_7.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Task3 {
    private LinkedList<String> list = new LinkedList<String>(
            Arrays.asList("Яблоко", "Персик", "Ананас", "Апельсин", "Киви")
    );

    public void printList(){
        list.forEach(System.out::println);
        System.out.println();
    }

    public void printFirstAndLastElements(){
        System.out.println("Первый элемент в списке: " + list.getFirst());
        System.out.println("Последний элемент в списке: " + list.getLast());

    }
}
