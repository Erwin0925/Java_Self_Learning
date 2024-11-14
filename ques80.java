// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques80 {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        long result = words.stream().filter(word -> word.charAt(0)=='B').count();

        System.out.println(result);
    
    }
}
