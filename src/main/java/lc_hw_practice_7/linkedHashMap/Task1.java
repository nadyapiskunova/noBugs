package lc_hw_practice_7.linkedHashMap;

import java.util.LinkedHashMap;

public class Task1 {
    private LinkedHashMap<String, Integer> persons = new LinkedHashMap<String,Integer>();

    public void addPerson(String name, Integer age){
        persons.put(name, age);
    }

    public void printPerson(){
        persons.forEach(
                (name, age) -> {
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );
    }

}
