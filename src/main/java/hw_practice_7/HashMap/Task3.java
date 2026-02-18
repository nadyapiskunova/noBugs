package hw_practice_7.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private HashMap<String, Integer> users = new HashMap<>();

    public void addUsers(String name, Integer age){
        users.put(name, age);
    }

    public void printAllUsers(){
        System.out.println();
        System.out.println("Все пользователи:");
        users.forEach(
                (name, age) -> {
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );

    }

    public void printUnderageUsers(){
        System.out.println();
        System.out.println("Пользователи до 18 лет:");

        boolean underageUsers = false;

        for (Map.Entry<String, Integer> users : users.entrySet()){
            String name = users.getKey();
            Integer age = users.getValue();

            if (age < 18){
                System.out.println("Имя: " + name + ", возраст: " + age);
                underageUsers = true;
            }

        }
        if (!underageUsers){
            System.out.println("Таких пользователей нет!");
        }
    }
}
