// Write a Java program to implement a lambda expression to find the average of a list of doubles.
//-----------------------------------------------------------------------------------//
import java.util.Arrays;
import java.util.List;

public class ques57 {
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(25.7,36.0,4.6,2.1);

        double avg = nums.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.print(avg);

    }
}
