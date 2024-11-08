public class ques36Manager extends ques36Employee {

    private String projectName;

    public ques36Manager(String name, String location, int salary, String projectName) {
        super(name, location, "Manager", salary);

        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 3;
    }

    @Override
    public void performanceReport(){
        System.out.println(getJobTitle() + " " + getName() + " is performing excellent in " + projectName);
    }

    public void printReport(){
        System.out.println(getJobTitle() + " " + getName() + " : ");
        System.out.println("Bonus + Salary : " + (getSalary() + calculateBonus()));
        System.out.println("Working in " + getLocation());
        System.out.println("Busying with :" + projectName);
    }  
}
