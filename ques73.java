//Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ques73 {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("HELLO", "WORLD", "java");

        Predicate <String> isAllUpper = str -> str.chars().allMatch(Character::isUpperCase);

        Predicate <String> isAllLower = str -> str.chars().allMatch(Character::isLowerCase);

        boolean allUpper = words.stream().allMatch(isAllUpper);
        boolean allLower = words.stream().allMatch(isAllLower);
        boolean mixed = !allUpper && !allLower;

        System.out.println("All Upper ? : " + allUpper);
        System.out.println("All Lower ? : " + allLower);
        System.out.println("Mixed ? :" + mixed);

    }
    
}
