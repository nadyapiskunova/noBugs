package lc_hw_practice_7.arrayDeque;

import java.util.ArrayDeque;

public class Task3 {
    private ArrayDeque<String> elements = new ArrayDeque<String>();

    public void addElementsFirstAndLast(String firstElement, String lastElement){
        elements.addFirst(firstElement);
        elements.addLast(lastElement);
    }

    public void removeElements(){
        System.out.println("remove first: " + elements.removeFirst());
        System.out.println("remove last: " + elements.removeLast());
        System.out.println();

    }

    public void printElement(){
        elements.forEach(System.out::println);
        System.out.println();
    }
}
