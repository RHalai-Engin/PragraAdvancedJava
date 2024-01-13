package SaturdayJan13.Exercise.StudentExer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        student.add(new Student(25, "John"));
        student.add(new Student(26, "Tom"));
        student.add(new Student(18, "Tony"));
        student.add(new Student(22, "Johnny"));
        student.add(new Student(29, "Tim"));
        student.add(new Student(20, "Sam"));

        List<Student> stuAge = student.stream().filter(age -> age.age > 18).collect(Collectors.toList());
        System.out.println(stuAge);

    }
}
