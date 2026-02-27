package lc_hw_practice_8.additional_task.task_7;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static <K, V> void printMapElements(Map<K, V> map){
        map.forEach(
                (key, value) -> {
                    System.out.println("phone: " + key + ", name: " + value);
                }
        );
    }

    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();

        phoneBook.put("123-12-23", "Flora");
        phoneBook.put("145-22-55", "Stella");
        phoneBook.put("148-22-55", "Bloom");

        printMapElements(phoneBook);

    }
}
