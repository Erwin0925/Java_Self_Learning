// Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
//-----------------------------------------------------------------------------------//
public class ques34 {
    public static void main(String[] args) {
        ques34Employee employee = new ques34Employee(50);
        employee.work();
        System.out.println(employee.getSalary());

        ques34HRManager hrManager = new ques34HRManager(100);
        hrManager.work();
        System.out.println(hrManager.getSalary());
        hrManager.addEmployee();
    }
    
}
