// Write a Java program to calculate the average of a list of integers using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques76 {
    public static void main(String[] args) {

        List <Integer> nums = Arrays.asList(1,2,3,3,4,7,8,9,9,10);

        double sum = nums.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println(sum);
        
    }
    
}
