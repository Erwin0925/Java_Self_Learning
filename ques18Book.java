public class ques18Book {
    private String title;
    private String author;
    private int ISBN;

    public ques18Book() {
        this("unknown", "unknown", 0);
    }

    ques18Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
    
}

// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
