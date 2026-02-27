package practice_8.library;

import practice_8.library.exeptions.BookNotFoundExceptions;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1994", "Оруел"));
        library.addBook(new Book("Мартин Иден", "Лондон"));
        library.addBook(new Book("Онегин", "Пушкин"));
        //library.addBook(new Book("Онегин", "Пушкин"));

        try {
            library.findBook("344");
        } catch (BookNotFoundExceptions e) {
            System.out.println("Поймали исключение");
        }
    }

}
