package lc_hw_practice_7.hashMap;

import java.util.HashMap;

public class Task1 {
    private HashMap<String, Integer> persons = new HashMap<String,Integer>();

    public void addPerson(String name, Integer age){
        persons.put(name, age);
    }

    public void printPersons(){
        persons.forEach(
                (name, age) -> {
                    System.out.println("Name: " + name + ", age: " + age);
                }
        );
    }
}
