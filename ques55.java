
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
//-----------------------------------------------------------------------------------//

public class ques55 {

    public static void main(String[] args) {
        
        List <Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.print("Numbers : ");
        nums.forEach(num -> System.out.print(num + " "));
        System.out.println("");

        List<Integer>evennums = nums.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.print("Even Numbers : ");
        evennums.forEach(en -> System.out.print(en + " "));
        System.out.println("");

        List<Integer>oddnums = nums.stream().filter(n -> n%2 !=0).collect(Collectors.toList());
        System.out.print("Odd Numbers : ");
        oddnums.forEach(on -> System.out.print(on + " "));
        System.out.println("");

        nums.forEach(num -> {
            if (num % 2 == 0) {
                System.out.println(num + " Even");
            } else {
                System.out.println(num + " Odd");
            }
        });

    }
    
}
