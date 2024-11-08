public class ques36Employee {
    private String name;
    private String location;
    private String jobTitle;
    private double salary;

    protected ques36Employee(String name, String location, String jobTitle, int salary) {
        this.name = name;
        this.location = location;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    protected String getName() {
        return name;
    }

    protected String getLocation() {
        return location;
    }

    protected String getJobTitle() {
        return jobTitle;
    }

    protected double getSalary() {
        return salary;
    }
    
    protected double calculateBonus(){
        return 0.0;
    }

    protected void performanceReport(){
        System.out.println("No performance report available");
    }
}