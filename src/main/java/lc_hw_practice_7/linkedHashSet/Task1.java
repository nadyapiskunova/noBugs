package lc_hw_practice_7.linkedHashSet;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task1 {
    private LinkedHashSet<String> elements = new LinkedHashSet<String>(
            Arrays.asList("Персик","Арбуз","Яблоко","Киви","Банан")
    );

    public void printElements(){
        elements.forEach(System.out::println);
    }
}
