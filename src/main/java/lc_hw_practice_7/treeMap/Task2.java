package lc_hw_practice_7.treeMap;

import java.util.TreeMap;

public class Task2 {
    private TreeMap<Integer, String> users = new TreeMap<Integer,String>();

    public void addUser(Integer id, String name){
        users.put(id, name);
    }

    public void printMaxAndMinKey(){
        System.out.println("min key: " + users.firstKey());
        System.out.println("max key: " + users.lastKey());
    }
}
