// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
// Implement a default constructor and a parameterized constructor that takes all three instance variables. 
// Use constructor chaining to initialize the variables. Print the values of the variables.
//-----------------------------------------------------------------------------------//
public class ques17 {
    public static void main(String[] args) {
        System.out.println("Student 1");
        ques17Student student = new ques17Student();
        System.out.println("Student id : " + student.getStudentId());
        System.out.println("Student id : " + student.getStudentName());
        System.out.println("Student id : " + student.getGrade());

        System.out.println("Student 2");
        ques17Student student2 = new ques17Student(003,"John",90);
        System.out.println("Student id : " + student2.getStudentId());
        System.out.println("Student id : " + student2.getStudentName());
        System.out.println("Student id : " + student2.getGrade());
    }
    
}
