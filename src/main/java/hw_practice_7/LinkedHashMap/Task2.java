package hw_practice_7.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    private Map<String, String> phoneBook= new LinkedHashMap<String, String>();

    Scanner scanner = new Scanner(System.in);

    public void addContact(){
        System.out.println("Для остановки добавления контактов в поле для ввода имени напишите \"Stop\"");
        while (true) {
            System.out.print("Добавьте имя контакта: ");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("stop")){
                break;
            }

            System.out.print("Добавьте номер телефона контакта: ");
            String numPhone = scanner.nextLine();

            phoneBook.put(name, numPhone);
        }
    }

    public void getPhoneNumber(){
        System.out.println();

        System.out.print("Введите имя контакта: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Номер телефона контакта " + name + ": " + phoneBook.get(name));

    }



}
