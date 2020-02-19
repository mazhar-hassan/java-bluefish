package com.o4.java.code.streams;

import com.o4.java.code.data.DataUtil;
import com.o4.java.code.data.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreamMethods {

    public static void main(String args) {

        //@TODO int[] array = list.stream().mapToInt(i->i).toArray();

        Student[] students = DataUtil.getSampleArrayOfStudents();

        //Convert array to list
        List<Student> studentList = Arrays.asList(students);

        //convert array to stream
        Stream<Student> stream1 = Stream.of(students);

        //Convert array to stream
        Stream<Student> stream2 = Arrays.stream(students);

        //convert list to stream
        Stream<Student> stream3 = studentList.stream();

        //convert String to character stream
        IntStream intStream = "This is message".chars();
        Stream<Character> objStream = intStream.mapToObj(c -> (char) c);

        //convert String to character-string stream
        Stream<String> stringStream = "This is message".chars().mapToObj(c -> String.valueOf(c));

        //convert primitive to stream
        intStream = IntStream.of(new int[] {5, 4, 3, 2, 1});

        //convert primitive int array to Integer stream
        int[] numbers = new int[] {5, 4, 3, 2, 1};
        Stream<Integer> objIntegerStream = Arrays.stream(numbers).mapToObj(i -> Integer.valueOf(i));
    }
}
