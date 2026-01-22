package hw_practice_2;

public class Book {
    String title, author;
    Book (String title, String author){
        this.title = title;
        this.author = author;
    }
    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
    void setTitle(String newTitle){
        title = newTitle;
    }
    void setAuthor(String newAuthor){
        author = newAuthor;
    }

    void printInfo(){
        System.out.println("Название книги \"" + getTitle() + "\", автор " + getAuthor());
    }
}
