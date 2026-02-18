package lc_hw_practice_7.linkedHashMap;

import java.util.LinkedHashMap;

public class Task2 {
    private LinkedHashMap<String, String> phoneBook = new LinkedHashMap<String, String>();

    public void addContact(String name, String numberPhone){
        phoneBook.put(name, numberPhone);
    }
    public void findContact(String name){
        System.out.println("Номер телефона " + "контакта " + name +  ": " + phoneBook.get(name));
    }
}
