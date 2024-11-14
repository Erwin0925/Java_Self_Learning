// Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques66 {
    public static void main(String[] args) {

        List <String> words = Arrays.asList("john","mary123","ali");

        boolean result = words.stream().anyMatch(word -> word.equals("mary"));

        System.out.print(result);
    }
    
}
