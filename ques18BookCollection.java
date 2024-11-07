import java.util.ArrayList;
import java.util.List;

public class ques18BookCollection {
    private final List<ques18Book> Books;

    //constructor 
    ques18BookCollection() {
        Books = new ArrayList<>();
    }

    public void addBook(ques18Book book){
        Books.add(book);
        System.out.println(book + " is added into collection");
    }

    public void removeBook(int ISBN){
        Books.removeIf(a -> a.getISBN() == ISBN);
        // for(ques18Book a : Books){
        //     if(a.getISBN() == ISBN){
        //         Books.remove(a);
        //         break;
        //     }
        // }
        System.out.println(ISBN + " is remove from collection");
    }

    public void displayCollection(){
        for(ques18Book b : Books){
            System.out.println(b);
        }
    } 
}