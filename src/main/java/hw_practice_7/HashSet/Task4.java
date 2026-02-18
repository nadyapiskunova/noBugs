package hw_practice_7.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    private HashSet<String> names;

    Scanner scanner = new Scanner(System.in);

    public Task4(){
        this.names = new HashSet<String>();
    }

    public void addName(){
        System.out.println("Вводите имя, для остановки программы напишите \"Stop\"");
        while(true){
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("Stop")){
                break;
            }
            if (names.contains(name)){
                System.out.println("Это имя уже содержится в списке, введите другое");
            }
            names.add(name);
        }



    }
}
