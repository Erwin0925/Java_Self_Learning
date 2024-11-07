// Anonymous Class Exercise
// Write a Java program to create an interface called Greeting with a method sayHello(). 
// In the main method, create an anonymous class that implements the Greeting interface 
// and override the sayHello() method to print "Hello, World!". Call the sayHello() method.
//-----------------------------------------------------------------------------------//
public class ques27 {
      public interface Greeting{
        void sayHello();
      }

      public static void main(String[] args) {
        Greeting greeting = new Greeting(){

            @Override
            public void sayHello(){
                System.out.print("Hello World");
            }
        };

        greeting.sayHello();
      }
    
}
