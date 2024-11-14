// Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
//-----------------------------------------------------------------------------------//

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class student{
    private String name;
    private int age;
    private int height;

    public student(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
        return name + " " +  age + " " + height + " ";
    }

}

public class ques71 {
    public static void main(String[] args) {
        List <student> std = new ArrayList<>();
        std.add(new student("john", 70, 100));
        std.add(new student("cohn2", 20, 110));
        std.add(new student("aohn3", 30, 120));
        std.add(new student("zohn4", 40, 130));

        System.out.println(std.toString());

        std.sort(Comparator.comparing(student::getName));
        System.out.println(std.toString());

        std.sort(Comparator.comparing(student::getAge));
        System.out.println(std.toString());

        
        List <String> names = std.stream()
            .map(stu -> stu.getName())
            .sorted()
            .collect(Collectors.toList());
        System.out.println(names);
        


    }
}
