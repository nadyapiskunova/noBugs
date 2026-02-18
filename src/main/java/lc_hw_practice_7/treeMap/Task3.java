package lc_hw_practice_7.treeMap;

import java.util.TreeMap;
import java.util.TreeSet;

public class Task3 {
    private TreeMap<Integer, String> employees = new TreeMap<Integer, String>();

    public void addEmployee(Integer id, String nameEmployee){
        employees.put(id, nameEmployee);

    }

    public void findNearestHigherId(Integer id){
        System.out.println("nearest higher id: " + employees.higherKey(id));
    }
}
