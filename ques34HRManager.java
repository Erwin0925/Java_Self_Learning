public class ques34HRManager extends ques34Employee{

    public ques34HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work(){
        System.out.println("Managing Employee");

    }

    public void addEmployee(){
        System.out.println("Employee is added");
    }

    
}
// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
//-----------------------------------------------------------------------------------//