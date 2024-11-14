// Write a Java program to implement a lambda expression to concatenate two strings.
//-----------------------------------------------------------------------------------//

import java.util.function.BiFunction;

interface StringConcatenate{
    String concatenate(String str1, String str2);
}


public class ques61 {
    public static void main(String[] args) {
        
        StringConcatenate concatenate = (str1, str2) -> str1 + str2;
        System.out.println(concatenate.concatenate("abc", "def"));

        BiFunction <String, String, String> concatenate2 = (str1, str2) -> str1 + " " + str2;
        System.out.println(concatenate2.apply("abc", "def"));

    }

    
  
}
