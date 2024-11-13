// Write a Java recursive method to check if a given array is sorted in ascending order.
//-----------------------------------------------------------------------------------//

public class que51 {

    public static boolean isAsc(int[] arr){
        return isAsc(arr, 0);
    }

    public static boolean isAsc(int[] arr, int index){

        if (index == arr.length-1){
            return true;
        }

        if (arr[index] > arr [index + 1]){
            return false;
        }

        return isAsc(arr, index+1);

    }

    public static void main(String[] args) {
        int[] num = {1, 2, 2, 3, 4, 5, 6};
        System.out.println("The array is arrange in ascending order : " + isAsc(num));
    }
    
}
