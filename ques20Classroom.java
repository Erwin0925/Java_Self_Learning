import java.util.ArrayList;

public class ques20Classroom {

    private String className;
    private ArrayList<String> students;
    private String[] subjects;

    public ques20Classroom(String className, ArrayList<String> students, String[] subjects ){
        this.className = className;
        this.students = students;
        this.subjects = subjects;
    }

    public ArrayList<String> getStudents(){
        return students;
    }

    public String[] getSubjects(){
        return subjects;
    }
    
    public String getClassName(){
        return className;
    }

    public void printStudent(ArrayList <String> students){
        for (String student : students){ 
            System.out.print(student + " ");
        }
    }

    public void printSubject(String[] subjects){
        for (String subject : subjects){
            System.out.print(subject + " ");
        }
    }
}
// Constructor with Array Initialization
// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). 
// Implement a parameterized constructor that initializes these variables. Print the values of the variables.
//-----------------------------------------------------------------------------------//