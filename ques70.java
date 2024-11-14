// Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.List;

public class ques70 {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,4,5);


        int max = nums.stream().mapToInt(Integer::intValue).max().orElse(-1);
        int max2 = nums.stream().mapToInt(Integer::intValue).filter(num -> num < max).max().getAsInt();
        System.out.println("The second max number is : " + max2);


        int secondmax = nums.stream()
            .mapToInt(Integer::intValue)
            .distinct()
            .boxed()
            .sorted((a,b)->b - a)
            .mapToInt(Integer::intValue)
            .skip(1)
            .findFirst()
            .getAsInt();
        System.out.println("The second max number is (2) : " + secondmax);


        int secondmin = nums.stream()
            .mapToInt(Integer::intValue)
            .distinct()
            .boxed()
            .sorted()
            .mapToInt(Integer::intValue)
            .skip(1)
            .findFirst()
            .getAsInt();
        System.out.println("The second min number is : " + secondmin);

    }
    
}
