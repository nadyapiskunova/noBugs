package hw_practice_7.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {
    private TreeMap<String, Integer> userScores = new TreeMap<String, Integer>();

    Scanner scanner = new Scanner(System.in);

    public void addUsersScores() {
        System.out.println("Введите \"Stop\" в поле для ввода имени, чтобы остановить ввод");
        while (true) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Введите балл: ");
            Integer score = Integer.parseInt(scanner.nextLine());

            userScores.put(name, score);
        }
        System.out.println();
    }

    public void printUsersScore(){
        userScores.forEach(
                (name, score) -> {
                    System.out.println("Name: " + name + ", score: " + score);
                }
        );
        System.out.println();
    }

    public void printMaxAndMinKey(){
        System.out.println("Max key: " + userScores.firstKey());
        System.out.println("Min key: " + userScores.lastKey());
        System.out.println();
    }
}
