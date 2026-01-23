package lc_hw_practice_3;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle(){
        return bookTitle;
    }
    String getAuthor(){
        return author;
    }
    int getYear(){
        return year;
    }
    String getCategory(){
        return category;
    }
    void setBookTitle(String newBookTitle){
        bookTitle = newBookTitle;
    }
    void setAuthor(String newAuthor){
        author = newAuthor;
    }
    void setYear(int newYear){
        year = newYear;
    }
    void setCategory(String newCategory){
        category = newCategory;
    }
}
