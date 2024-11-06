// Constructor Overloading
// Write a Java program to create a class called "Book" with instance variables title, author, and price. 
// Implement a default constructor and two parameterized constructors:
    // One constructor takes title and author as parameters.
    // The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.
//-----------------------------------------------------------------------------------//
public class ques16 {
    public static void main(String[] args) {
        System.out.println("Book1");
        ques16Book book = new ques16Book("harry porter", "J. K. Rowling");
        System.out.println("Book title : " + book.getTitle());
        System.out.println("Book author : " + book.getAuthor());

        System.out.println("Book2");
        ques16Book book2 = new ques16Book("Journey to the center of the earth", "Jules Verne", (float)15.60);
        System.out.println("Book title : " + book2.getTitle());
        System.out.println("Book author : " + book2.getAuthor());
        System.out.println("Book price : " + "RM" + book2.getPrice());
    }  
}
