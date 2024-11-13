// Write a Java recursive method to calculate the sum of all numbers from 1 to n.
//-----------------------------------------------------------------------------------//

public class ques39 {

    public int sum(int num){
        if (num == 0){
            return 0;
        }
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        int num = 10;
        ques39 obj = new ques39();
        int ans = obj.sum(num);
        System.out.println("The total sum from 1 to 10 is : " + ans);
    }
}
