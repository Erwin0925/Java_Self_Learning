public class ques17Student {
    private int studentId;
    private String studentName;
    private int grade;

    ques17Student() {
        this(0,"unknown",0);
    }

    public ques17Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudentName() {
        return studentName;
    }
    
}
// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
// Implement a default constructor and a parameterized constructor that takes all three instance variables. 
// Use constructor chaining to initialize the variables. Print the values of the variables.
//-----------------------------------------------------------------------------------//
