package hw_practice_7.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    private Map<Integer, String> views = new LinkedHashMap<Integer, String>();

    public void addView(Integer id, String name){
        if (views.size() >= 2){
            System.out.println("LOG: Проверен размер мапы ");
            int firstKey = views.keySet().iterator().next();
            System.out.println("LOG: Получена первая пара");
            views.remove(firstKey);
            System.out.println("LOG: Удалена первая пара ");
            views.put(id, name);
            System.out.println("LOG: Добавлен последний элемент, вместо первого ");
        } else {
            views.put(id, name);
            System.out.println("LOG: добавлен элемент, потому что размер не превышен ");
        }
    }

    public void printAllViews(){
        System.out.println();
        System.out.println("History views: ");
        views.forEach(
                (id, name)->{
                    System.out.println("id page: " + id + " name page: " + name);
                }
        );
    }
}
