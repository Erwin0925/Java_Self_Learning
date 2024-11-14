// Write a Java program to remove all duplicate elements from a list using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ques79 {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,3,4,5,8,9,3,7);

        List <Integer> container = nums.stream().distinct().collect(Collectors.toList());

        System.out.println(container);
    }
    
}
