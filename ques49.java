// Write a Java recursive method to find the maximum element in an array.
//-----------------------------------------------------------------------------------//

public class ques49 {

    public static int getMax(int[]arr){
        return getMax(arr, 0);
    }

    public static int getMax(int[]arr, int index){
        if(arr.length == index){
            return 0;
        }

        int max = getMax(arr, index+1);
        if(arr[index] >= max){
            max = arr[index];
        }
        return max;
    }

    public static int getMax2(int[]arr){
        return getMax2(arr, 0, arr.length-1);
    }

    public static int getMax2(int[]arr, int left, int right){   
        if (left == right){
            return arr[left];
        }

        int mid = (left + right) /2;
        int leftmax = getMax2(arr, left, mid);
        int rightmax = getMax2(arr, mid+1, right);

        return Math.max(leftmax, rightmax);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 5, 5, 2, 3, 4, 5, 5, 5, 8, 7, 6, 4, 5, 5, 5, 44};
        System.out.println("Total sum : " + getMax(num));

        System.out.println("Total sum : " + getMax2(num));
    }
    
}
