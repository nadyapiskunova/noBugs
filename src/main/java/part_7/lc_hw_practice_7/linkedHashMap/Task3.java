package part_7.lc_hw_practice_7.linkedHashMap;

import java.util.LinkedHashMap;

public class Task3 {
    private LinkedHashMap<Integer,String> views = new LinkedHashMap<Integer, String>();
    private int counter = 1;

    public void addView(String page){
        if(views.size() >= 10){
            int firstKey = views.keySet().iterator().next();
            views.remove(firstKey);
            views.put(counter++, page);
        } else views.put(counter++, page);
    }

    public void printViews(){
        views.forEach(
                (id, page) -> {
                    System.out.println("id page: " + id + ", name page: " + page);
                }
        );
    }
}
