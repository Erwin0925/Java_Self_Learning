// Write a Java recursive method to count the number of occurrences of a specific element in an array.
//-----------------------------------------------------------------------------------//
import java.util.Arrays;

public class ques45_I {

    public static int getOccurrences(int[] arr,int num){
        return getOccurrences(arr, num,0);
    }

    public static int getOccurrences(int[] arr,int num, int total){

        if (arr.length == 0){
            return 0;
        }

        if (arr[0] == num){
            total++;
        }

        getOccurrences(Arrays.copyOfRange(arr,1,arr.length), num);

        return total;
    }

    public static void main(String[] args) {
        int[] num = {1,2,5,5,2,3,4,5,5,5,8,7,6,4,5,5,5,4};
        System.out.println("Total occurrences : " + ques45_I.getOccurrences(num, 5));
    
    }
    
}
//bad solution as require recreate new array every recrusive. 