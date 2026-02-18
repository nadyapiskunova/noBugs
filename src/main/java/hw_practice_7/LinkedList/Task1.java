package hw_practice_7.LinkedList;

import java.util.LinkedList;

public class Task1 {
    private final LinkedList<String> list = new LinkedList<>();

    public void addString(String str){
        list.add(str);
    }
    public void printStringList(){
        list.forEach(System.out::println);
    }

}
