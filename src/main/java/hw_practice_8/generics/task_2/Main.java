package hw_practice_8.generics.task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] number = {1, 23, 4, 52, 9};
        String[] winxPerson = {"Bloom", "Stella", "Leyla"};
        Coffee[] coffees = {new Coffee("Brazil"), new Coffee("Columbia")};

        printArray(number);
        printArray(winxPerson);
        printArray(coffees);

    }
}
