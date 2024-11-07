// Static Variables
// Write a Java program to create a class called "Counter" with a static variable count. 
// Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.
//-----------------------------------------------------------------------------------//
public class ques22 {
    public static void main(String[] args) {
        ques22Counter counter1 = new ques22Counter();
        ques22Counter counter2 = new ques22Counter();
        ques22Counter counter3 = new ques22Counter();
        ques22Counter counter4 = new ques22Counter();
        System.out.print(ques22Counter.count);
    }
}
