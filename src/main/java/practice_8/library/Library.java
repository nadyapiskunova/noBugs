package practice_8.library;

import practice_8.library.exeptions.BookNotFoundExceptions;
import practice_8.library.exeptions.InvalidBookExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) throws InvalidBookExceptions{
        if(books.contains(book)){
            throw new InvalidBookExceptions("Taкая книга уже существует в библиотеке!");
        } else {
            books.add(book);
        }
    }

    public Book findBook(String name) throws BookNotFoundExceptions {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(
                book -> {
                    if (book.getName() == name){
                        foundBook.set(book);
                    }
                }
        );

        if (foundBook.get() == null){
            throw new BookNotFoundExceptions("Не нашли книгу по имени " + name);
        }
        return foundBook.get();
    }


}
