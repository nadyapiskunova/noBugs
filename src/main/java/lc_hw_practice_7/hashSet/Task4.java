package lc_hw_practice_7.hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    private HashSet<String> names = new HashSet<String>();

    Scanner scanner = new Scanner(System.in);
    public void addAndCheckDuplicateName(){
        System.out.println("Для остановки ввода напишите \"Stop\"");
        while (true){
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();{
                if (name.equalsIgnoreCase("stop")){
                    break;
                }
                if (names.contains(name)){
                    System.out.println("Такое имя в списке есть, введите другое!");
                }

                names.add(name);
            }
        }
    }
}
