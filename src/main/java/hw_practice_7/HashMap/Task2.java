package hw_practice_7.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    private HashMap<String, Integer> persons;

    Scanner scanner = new Scanner(System.in);

   public Task2(){
        this.persons = new HashMap<String, Integer>();
    }

    public void addPerson() {
        System.out.println();
        System.out.println("Вводите имя и возраст, чтобы прекратить ввод напишите \"Stop\"");
        while (true) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Введите возраст: ");
            Integer age = Integer.parseInt(scanner.nextLine());

            persons.put(name, age);

        }
        System.out.println();
    }

    public void printPerson(){
        persons.forEach(
                (name, age) -> {
                    System.out.println("Имя: " + name + ", возраст: " + age);
                }
        );
    }

     public void checkName(){
         System.out.println();
       System.out.print("Введите имя для проверки в списке: ");
         String name = scanner.nextLine();
       if (persons.containsKey(name)){
           System.out.println("Имя в списке есть");
       } else {
           System.out.println("В списке такого имени нет");
       }
         System.out.println();
     }


}
