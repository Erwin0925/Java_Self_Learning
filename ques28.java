// Inner Class Accessing Outer Class Members:
// Write a Java program to create an outer class called Library with an instance variable libraryName. 
// Create an inner class Book with a method getLibraryName() that returns the name of the library. 
// Instantiate the Book class and call the getLibraryName() method.
//-----------------------------------------------------------------------------------//
public class ques28 {
    public static void main(String[] args) {
        ques28Library library = new ques28Library("NPM");
        
        ques28Library.Book book =  library.new Book();

        System.out.println("Library Name : " + book.getLibraryName());
        
    }
    
}
