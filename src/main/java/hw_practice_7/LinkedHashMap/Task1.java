package hw_practice_7.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    private Map<Integer,String> users = new LinkedHashMap<Integer,String>();

    public void addUsers (Integer id, String name){
        users.put(id, name);
    }

    public void printUsers(){
        users.forEach(
                (id, name) ->{
                    System.out.println("ID user: " + id + ", name user: " + name);
                }
        );
    }
}
