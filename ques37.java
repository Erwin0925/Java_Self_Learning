// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
//-----------------------------------------------------------------------------------//
public class ques37 {
    public static void main(String[] args) {
        ques37Manager manager = new ques37Manager("john", 100, 70);
        System.out.println(manager.calculateSalary());
        manager.displayInfo();
    }
}
