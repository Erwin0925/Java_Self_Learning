// Constructor with Array Initialization
// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). 
// Implement a parameterized constructor that initializes these variables. Print the values of the variables.
//-----------------------------------------------------------------------------------//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ques20 {
    public static void main(String[] args) {

        ArrayList <String> students = new ArrayList<>();
        Collections.addAll(students, "john", "mary","peter");

        String[] subject = {"english", "physic"};

        ques20Classroom classroom = new ques20Classroom("5SC4", students, subject);

        System.out.println("className :" + classroom.getClassName());
        System.out.println("Students :" + classroom.getStudents());
        System.out.println("Subjects :" + Arrays.toString(classroom.getSubjects()));

        System.out.print("Students : ");
        classroom.printStudent(classroom.getStudents());
        System.out.println();
        System.out.print("Subjects : ");
        classroom.printSubject(classroom.getSubjects());

    }
}
