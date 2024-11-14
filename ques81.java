// Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ques81 {
    public static void main(String[] args) {
        
        List <String> words = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        List <String> ascWords = words.stream().sorted().collect(Collectors.toList());
        System.out.println(ascWords);

        List <String> descWords = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descWords);


    }
    
}
