
import java.util.Arrays;

// Write a Java program to implement a lambda expression to count words in a sentence.
//-----------------------------------------------------------------------------------//

public class ques63 {
    public static void main(String[] args) {
        String text = "My name is John";

        long count = Arrays.stream(text.split(" ")).count();

        System.out.println(count);

        

    }
    
}
