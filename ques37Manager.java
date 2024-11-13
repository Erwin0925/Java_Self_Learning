public class ques37Manager extends ques37Employee {

    private double bonus;

    public ques37Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Salary : " + calculateSalary());
    }

}
// Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). 
// Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.
//-----------------------------------------------------------------------------------//