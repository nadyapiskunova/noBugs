package practice_7.contact_book;

public class Main {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("Никита", 1234);
        contactBook.addContact("Коля", 242423);

        contactBook.printContacts();
        contactBook.updatePhone("Коля", 78954);
        contactBook.printContacts();
    }
}
