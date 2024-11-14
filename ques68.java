// Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques68 {
    public static void main(String[] args) {

        List <String> words = Arrays.asList("john","mary123","ali");

        int longestString = words.stream()
            .mapToInt(String::length)
            .max()
            .orElse(0);

        System.out.println(longestString);
        
    }
}
