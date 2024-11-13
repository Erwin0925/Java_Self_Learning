//Write a Java recursive method to calculate the nth Fibonacci number.
//-----------------------------------------------------------------------------------//

public class ques40 {

    public static int fibonacci(int num){
        if(num ==0){
            return 0;
        }else if (num == 1){
            return 1;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }

    public static int fibonacci2 (int num){
        if (num == 0 ) return 0;
        if (num == 1 ) return 1;

        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= num; i++) { // i == 2 as F(n) start from 2
            sum = a + b;
            a = b;
            b = sum;   
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Method 1, Fabonacci number is : " + ques40.fibonacci(7));
        System.out.println("Method 2, Fabonacci number is : " + ques40.fibonacci2(4));
    } 
}

