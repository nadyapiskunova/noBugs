package practice_7.contact_book;

import java.util.HashMap;

public class ContactBook {
    private HashMap<String, Integer> contacts;

    public ContactBook(){
        this.contacts = new HashMap<>();
    }
    //  ключ-значение (имя телефон)
    public void addContact(String name, Integer phone){
        contacts.put(name, phone);
    }
    // поиска контакта по имени
    public Integer getPhone(String name){
        return contacts.get(name);
    }
    // обновление телефона по имени
    public void updatePhone(String name, Integer updatedPhone){
        contacts.put(name, updatedPhone);
    }

    public void printContacts(){
        System.out.println();
        System.out.println("Все контакты: ");
        contacts.forEach(
                (name, phone) ->{
                    System.out.println("имя " + name + ", телефон " + phone);

                }
        );
    }



}
