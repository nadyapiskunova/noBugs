package lc_hw_practice_7.linkedList;

import java.util.LinkedList;

public class Task1 {
    private LinkedList<String> list = new LinkedList<String>();

    public void addString(String str){
        list.add(str);
    }

    public void printStringList(){
        list.forEach(System.out::println);
    }
}
