package hw_practice_8.additional_task.task_7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static <K,V> void printMap(Map<K,V> map){
        map.forEach(
                (key, value) ->{
                    System.out.println("номер телефона: " + key + ", имя: " + value);
                }
        );
    }
    public static void main(String[] args) {
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("123-123-12","Stella");
        stringStringMap.put("654-87-98", "Flora");

        printMap(stringStringMap);
    }
}
