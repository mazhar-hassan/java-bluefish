package com.o4.java.code.streams;

import com.o4.java.code.data.DataUtil;
import com.o4.java.code.data.Student;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ObjectListMapping {

    public static void main(String args[]) {

        //get list of ids from object list wrapped in another object
        List<Student> students = DataUtil.getSampleStudents();
        System.out.println(students);

        List<Integer> studentIds = students.stream().map(Student::getId).collect(Collectors.toList());
        System.out.println("All students: "+studentIds);

        //get list of ids filtered by department
        studentIds = students.stream().filter(s -> s.getCode().equals("DEV")).map(Student::getId).collect(Collectors.toList());
        System.out.println("DEV students: "+studentIds);

        //get count of DevOps
        long count = students.stream().filter(s -> s.getCode().equals("DevOps")).count();
        System.out.println("DevOps count :" + count);

        //get count of android
        count = students.stream().filter(s -> s.getCode().equals("android")).count();
        System.out.println("Android count :" + count);


    }

    private static void anoherCall(UUID uuid) {
        System.out.println(uuid);
    }

    private static Optional<String> getUUIDSring() {
        return Optional.ofNullable(null);
    }
}
