// Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques58 {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,3,4,7,8,9,9,10);

        List <Integer> newnums = nums.stream().distinct().collect(Collectors.toList());

        System.out.println(newnums);
            
    }
    
}
