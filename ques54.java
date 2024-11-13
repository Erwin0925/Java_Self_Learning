// Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques54 {

    public static void main(String[] args) {
        
        List<String> stringList = Arrays.asList("Red", "Blue","Pink");
        stringList.forEach((sl) -> System.out.print(sl + " "));
        System.out.println();

        stringList.forEach((sl) -> System.out.print(sl.toUpperCase() + " "));
        System.out.println();

        stringList.replaceAll(sl -> sl.toUpperCase());
        stringList.forEach((sl) -> System.out.print(sl + " "));
        System.out.println();




    }
    
}
