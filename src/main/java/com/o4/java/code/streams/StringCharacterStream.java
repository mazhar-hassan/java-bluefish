package com.o4.java.code.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCharacterStream {
    public static void main(String argsp[]) {
        String s = "UUDDUUUDD";

        long uCount = s.chars().filter(c -> c == 'U').count();
        System.out.println("U count is " + uCount);

        //join collection
        //join character array
        String joined = Stream.of("A", "B", "C", "D", "A").collect(Collectors.joining(","));
        System.out.println("joined: " + joined);

        //split character array
        //collect to list
        List<String> list = Arrays.stream(joined.split(",")).collect(Collectors.toList());
        System.out.println("collected to list: " + list);

        //collect to set
        Set<String> set = Arrays.stream(joined.split(",")).collect(Collectors.toSet());
        System.out.println("collected to set: " + set);

    }
}
