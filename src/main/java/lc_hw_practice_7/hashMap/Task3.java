package lc_hw_practice_7.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private HashMap<String, Integer> users = new HashMap<String, Integer>();

    public void addUser(String name, Integer age){
        users.put(name, age);
    }

    public void underageUsers(){
        System.out.println("Пользователи до 18 лет: ");

        boolean underageUser = false;

        for (Map.Entry<String,Integer> users : users.entrySet()){
            String name = users.getKey();
            Integer age = users.getValue();

            if (age < 18){
                System.out.println("Имя: " + name + ", возраст: " + age);
                underageUser = true;
            }
        }
        if (!underageUser){
            System.out.println("Пользователей младше 18 лет в списке нет!");
        }
    }
}
