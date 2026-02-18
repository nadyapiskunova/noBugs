package lc_hw_practice_7.arrayDeque;

import java.util.ArrayDeque;

public class Task2 {
    private ArrayDeque<String> elements = new ArrayDeque<String>();

    public void addElements(String element){
        elements.push(element);
    }

    public void printInvertElements(){
        while (!elements.isEmpty()){
            System.out.println(elements.pop());
        }
    }
}
