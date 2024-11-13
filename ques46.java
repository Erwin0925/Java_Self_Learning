// Write a Java recursive method to find the sum of all odd numbers in an array.
//-----------------------------------------------------------------------------------//

public class ques46 {

    public static int sumOdd(int[]arr){
        return sumOdd(arr, 0);
    }

    public static int sumOdd(int[] arr, int index){
        if (arr.length == index){
            return 0;
        }

        int sum = sumOdd(arr, index+1);
        if (arr[index]%2 != 0){
            sum += arr[index];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 5, 2, 3, 4, 5, 5, 5, 8, 7, 6, 4, 5, 5, 5, 4};
        System.out.println("Total sum : " + sumOdd(num));
    }
}
