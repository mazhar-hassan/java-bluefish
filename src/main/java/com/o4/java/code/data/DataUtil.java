package com.o4.java.code.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataUtil {

    public static Course getSampleCourse() {

        List<Student> students = getSampleStudents();
        Course course = new Course(101, "Maths", students);

        return course;
    }

    public static List<Student> getSampleStudents() {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Mazhar Hassan", "DEV"));
        students.add(new Student(2, "Fahad Shehzaad", "DEV"));
        students.add(new Student(3, "Hassan Hayyat", "QA"));
        students.add(new Student(4, "Asim Ali", "DevOps"));
        students.add(new Student(5, "Shehzaad Hammed", "DevOps"));
        students.add(new Student(6, "Faisal Mehmood", "DBA"));
        students.add(new Student(7, "Umar Kaleem Butt", "Manager"));
        students.add(new Student(7, "Irfan Doggar", "Lead"));

        return students;
    }

    public static Student[] getSampleArrayOfStudents() {
        List<Student> list = getSampleStudents();

        //convert list ot array
        //convert a list to array
        return list.toArray(new Student[list.size()]);
    }

}
