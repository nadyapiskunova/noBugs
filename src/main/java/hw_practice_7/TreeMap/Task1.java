package hw_practice_7.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    private Map<String, Integer> userScores = new TreeMap<String, Integer>();

    public void addUserScore(String name, Integer score){
        userScores.put(name, score);
    }

    public void printAllUserScores(){
        userScores.forEach(
                (name, score) -> {
                    System.out.println("Name: " + name + ", score: " + score);
                }
        );
    }
}
