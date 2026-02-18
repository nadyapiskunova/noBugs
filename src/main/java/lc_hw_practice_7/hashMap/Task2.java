package lc_hw_practice_7.hashMap;

import java.util.HashMap;

public class Task2 {
    private HashMap<String, Integer> persons = new HashMap<String, Integer>();

    public void addPerson(String name, Integer age){
        persons.put(name, age);
    }
    public void checkName(String name){
        if(persons.containsKey(name)){
            System.out.println("Имя в списке есть");
        } else {
            System.out.println("Имени в списке нет");
        }

    }
}
