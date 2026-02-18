package lc_hw_practice_7.arrayList;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;

public class Task3 {

    private ArrayList<String> words = new ArrayList<String>();

    public void addWords(String word){
        words.add(word);
    }

    public void printLongWord(){
        String maxWord = " ";

        for (String word : words){
            if (maxWord.length() < word.length()) {
                maxWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + maxWord);
    }
}
