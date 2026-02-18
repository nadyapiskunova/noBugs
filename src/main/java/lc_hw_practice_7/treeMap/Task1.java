package lc_hw_practice_7.treeMap;

import java.util.TreeMap;

public class Task1 {
    private TreeMap<String, Integer> scores = new TreeMap<String, Integer>();

    public void addScore(String name, Integer score){
        scores.put(name, score);
    }

    public void printScores(){
        scores.forEach(
                (name, score) -> {
                    System.out.println("name: " + name + ", score: " + score);
                }
        );
    }
}
