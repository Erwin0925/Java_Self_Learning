// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
//-----------------------------------------------------------------------------------//
public class ques18 {
    public static void main(String[] args) {
        ques18BookCollection bookcollection = new ques18BookCollection();


        ques18Book book1 = new ques18Book("Harry Poter", "J.K.Rowling",13466);
        ques18Book book2 = new ques18Book("Harry Poter2", "J.K.Rowling",48730);
    
        bookcollection.addBook(book1);
        bookcollection.addBook(book2);
    
        bookcollection.displayCollection();
        
        bookcollection.removeBook(48730);

        bookcollection.displayCollection();
        
    }
  
}
