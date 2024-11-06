public class ques16Book {
    private String title;
    private String author;
    private float price;

    ques16Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    ques16Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    
}
// Constructor Overloading
// Write a Java program to create a class called "Book" with instance variables title, author, and price. 
// Implement a default constructor and two parameterized constructors:
    // One constructor takes title and author as parameters.
    // The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.
//-----------------------------------------------------------------------------------//
