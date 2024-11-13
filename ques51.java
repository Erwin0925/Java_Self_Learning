// Write a Java recursive method to find the sum of the digits of a given integer.\
//-----------------------------------------------------------------------------------//

public class ques51 {

    public static int getSum(int num){
        if (num < 10) {
            return num;
        }

        int lastnum = num%10;
        int remainingsum = num/10;

        return lastnum + getSum(remainingsum);
    }

    public static void main(String[] args) {
        System.out.println("Total Sum : " + getSum(12345));
    } 
}
