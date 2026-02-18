package hw_practice_7.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class Task3 {
    private TreeMap<Integer, String> employees = new TreeMap<Integer, String>();

    Scanner scanner = new Scanner(System.in);
    private int currentId = 1;

    public void addEmployee(){
        System.out.println("Чтобы завершить ввод в поле для ввода имени напишите \"Stop\"");
        while (true){
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")){
                break;
            }
            employees.put(currentId++, name);
        }
        System.out.println();
    }

    public void printEmployees(){
        employees.forEach(
                (id, name) -> {
                    System.out.println("ID сотрудника: " + id + "; Имя сотрудника: " + name + ";" );
                }
        );
        System.out.println();
    }
    public void getNextId(){
        System.out.print("Введите ID сотрудника: ");
        int currentId = scanner.nextInt();
        if (employees.containsKey(currentId)){
            System.out.println("Ближайший больший ID: " + employees.higherKey(currentId));
        } else {
            System.out.println("Такого ID не существует!");
        }
    }

}
