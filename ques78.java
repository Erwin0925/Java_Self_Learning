//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques78 {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int eventotal = nums.stream().mapToInt(Integer::intValue).filter(num -> num%2==0).sum();

        int oddtotal = nums.stream().mapToInt(Integer::intValue).filter(num -> num%2!=0).sum();

        System.out.println(eventotal);
        System.out.println(oddtotal);
    }
    
}
