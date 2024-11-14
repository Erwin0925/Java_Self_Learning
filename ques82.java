// Write a Java program to find the maximum and minimum values in a list of integers using streams.
//-----------------------------------------------------------------------------------//

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ques82 {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(1,2,3,3,4,5,8,9,3,7);

        int MaxValue = nums.stream().mapToInt(Integer::intValue).max().getAsInt();
        System.out.println(MaxValue);
        int MinValue = nums.stream().min(Integer::compare).orElse(null);
        System.out.println(MinValue);

        int secondMax = nums.stream()
            .distinct()
            .sorted(Comparator.reverseOrder())
            .skip(1)
            .findFirst()
            .orElse(0);
        System.out.println(secondMax);

        int secondMin = nums.stream()
            .distinct()
            .sorted()
            .skip(1)
            .findFirst()
            .orElse(0);
        System.out.println(secondMin);
    }
    
}
