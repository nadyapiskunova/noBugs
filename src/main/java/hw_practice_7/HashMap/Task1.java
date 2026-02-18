package hw_practice_7.HashMap;

import java.util.HashMap;

public class Task1 {
    private HashMap<String, Integer> mapPersons;

    public Task1(){
        this.mapPersons = new HashMap<String, Integer>();
    }

    public void addPerson(String name, Integer age){
        mapPersons.put(name, age);
    }

    public void printPersons(){
        mapPersons.forEach(
                (name, age) ->{
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );
    }
}
