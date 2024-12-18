// Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
// Example: {10,2,38,23,38,23,21}
// Output: 23

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ques12 {
    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,4,4,5,5,8};

        Map <Integer, Integer> numcount = new HashMap<>();

        for (int i = 0; i <num.length; i++) {
            numcount.put(num[i], numcount.getOrDefault(num[i], 0)+1);
        }
        

        ArrayList <Integer> num2 = new ArrayList<>();
        numcount.forEach((key,value)->{
            if (value ==1){
                num2.add(key);
            }
        });

        for (var num3 : num2) {
            System.out.print(num3 + " ");
        }




    }
}
