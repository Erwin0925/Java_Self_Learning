public class ques34Employee {

    private int salary;

    public ques34Employee(int salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Working as an employee");

    }

    public int getSalary(){
        return salary;

    }
    
}
// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
//-----------------------------------------------------------------------------------//