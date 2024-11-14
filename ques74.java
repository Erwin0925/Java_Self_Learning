// Write a Java program to implement a lambda expression to find the average length of strings in a list.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques74 {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        double avg = words.stream().mapToInt(String::length).average().getAsDouble();

        System.out.println(avg);

    }
    
}
