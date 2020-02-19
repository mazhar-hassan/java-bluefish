package com.o4.java.code.streams;

import com.o4.java.code.data.DataUtil;
import com.o4.java.code.data.Student;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PeopleWithSameDepartment {

    public static void main(String args[]) {
        List<Student> students = DataUtil.getSampleStudents();


        Map<String, Integer> map = new HashMap<>();
        //get the total count who are in same department
        students.forEach(s -> {
            if (!map.containsKey(s.getCode())) {
                map.put(s.getCode(), 1);
            } else {
                int existing = map.get(s.getCode());
                map.put(s.getCode(), existing + 1);
            }
        });

        Integer count = map.values().stream().reduce(0, (i, j) -> j > 1 ? (j + i) : i);
        System.out.println("Number of people with same department: " + count);


        long uniqueCount = students.stream().map(Student::getCode).distinct().count();
        System.out.println("Num peopel: " + ( students.size() - uniqueCount ));



        Set<String> codes = new HashSet<>();
        Set<String> firstTime = new HashSet<>();
        AtomicInteger countx = new AtomicInteger(0);
        students.stream()
                .forEach(student -> {
                    if (codes.contains(student.getCode())) {
                        countx.getAndIncrement();
                    } else if (firstTime.contains(student.getCode()) && !codes.contains(student.getCode())) {

                        codes.add(student.getCode());
                        countx.getAndIncrement();
                        countx.getAndIncrement();

                    } else {
                        firstTime.add(student.getCode());
                    }
                });

        System.out.println("Number of people with same department: " + countx);

    }
}
