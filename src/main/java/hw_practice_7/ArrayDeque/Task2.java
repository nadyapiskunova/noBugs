package hw_practice_7.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Task2 {
    private ArrayDeque<String> words = new ArrayDeque<String>();

    Scanner scanner = new Scanner(System.in);

    public void addWords(){
        System.out.println("Добавьте любое слово, для остановки ввода напишите stop");
        while(true){
            String word = scanner.nextLine();
            if (word.equalsIgnoreCase("stop")){
                break;
            }

            words.push(word);
        }
    }

    public void printListWordsInvert(){
        while (!words.isEmpty()){
            System.out.println(words.pop());
        }
    }
}
