// Write a Java program that creates a class hierarchy for employees of a company. 
// The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title. 
// Implement methods for calculating bonuses, generating performance reports, and managing projects.
//-----------------------------------------------------------------------------------//
public class ques36 {
    public static void main(String[] args) {

        ques36Employee employee = new ques36Employee("john", "KL", "random", 0);
        System.out.println(employee.getJobTitle());
        System.out.println("--------------------------------------------");

        ques36Developer developer = new ques36Developer("peter", "peneng", 1000, "ejkzee", "java");
        System.out.println("Bonus : " + developer.calculateBonus());
        developer.performanceReport();
        developer.printReport();
        System.out.println("--------------------------------------------");
        
        ques36Manager manager = new ques36Manager("mary", "Sabah", 2000, "Thrones");
        System.out.println("Bonus : " + developer.calculateBonus());
        manager.performanceReport();
        manager.printReport();

    }
    
}
