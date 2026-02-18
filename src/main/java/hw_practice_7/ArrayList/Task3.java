package hw_practice_7.ArrayList;

import java.util.ArrayList;

public class Task3 {
    private ArrayList<String> words = new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }

    public void printWords(){
        words.forEach(System.out::println);
    }

    public void printLongWord(){
        String longWords = "";
        for (String word : words){
            if (word.length() > longWords.length()){
                longWords = word;
            }
        }
        System.out.println("Самое длинная строка: " + longWords);
    }
}
