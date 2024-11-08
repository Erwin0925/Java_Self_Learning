public class ques36Developer extends ques36Employee {

    private String projectName;
    private String projectLanguage;
    
    public ques36Developer(String name, String location, int salary, String projectName, String projectLanguage) {
        super(name, location, "Developer", salary);
        this.projectName = projectName;
        this.projectLanguage = projectLanguage;
    }

    public String getProjectName(){
        return projectName;
    }

    public String getProjectLanguage(){
        return projectLanguage;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 3.5; 
    }
    
    @Override
    public void performanceReport(){
        System.out.println(getJobTitle() + " " + getName() + "is working excellent in " + projectName + " with" + projectLanguage);
    }

    public void printReport(){
        System.out.println(getJobTitle() + " " + getName() + " : ");
        System.out.println("Bonus + Salary : " + (getSalary() + calculateBonus()));
        System.out.println("Working in " + getLocation());
        System.out.println("Busying with :" + projectName);
        System.out.println("Project Language :" + projectLanguage);
    }  
}
