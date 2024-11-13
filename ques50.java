// Write a Java recursive method to calculate the product of all numbers in an array.
//-----------------------------------------------------------------------------------//

public class ques50 {
    public static int getProduct(int[] num){
        return getProduct(num,0);

    }

    public static int getProduct(int[] num, int index){
        if (num.length == index){
            return 1;
        }

        int sum = getProduct(num, index+1);
        sum = sum * num[index];

        return sum;
    }

    public static int getProduct2(int[] num){
        return getProduct2(num,0, num.length-1);

    }

    public static int getProduct2(int[] num, int left, int right){
        if(left == right){
            return num[left];
        }

        int mid = (left + right)/2;
        int productLeft = getProduct2(num, left, mid);
        int productRight = getProduct2(num, mid+1, right);

        return productLeft * productRight;
    }



    public static void main(String[] args) {
        int[] num = {1, 2, 5};
        System.out.println("Total product : " + getProduct(num));

        System.out.println("Total product : " + getProduct2(num));
    }
    
}
