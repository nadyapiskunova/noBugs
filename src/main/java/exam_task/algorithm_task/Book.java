package exam_task.algorithm_task;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;

        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode(){
        return Objects.hash(title, author);
    }


}
