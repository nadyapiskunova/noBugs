package lc_hw_practice_7.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private HashSet<Integer> numbers = new HashSet<Integer>();

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void addSizeForNumberList(int size){
        for (int i = 1; i < size; i++){
            numbers.add(random.nextInt(100));
        }
    }

    public void printNumbers(){
        numbers.forEach(
                num -> {
                    System.out.print(num + " ");
                }
        );
        System.out.println();
    }

    public void checkNumber(){
        System.out.println("Введите число, чтобы проверить есть ли оно в списке: ");
        int num = scanner.nextInt();
        if (numbers.contains(num)){
            System.out.println("Число " + num + " содержится в списке");

        } else {
            System.out.println("Число " + num + " не содержится в списке");

        }

    }
}
