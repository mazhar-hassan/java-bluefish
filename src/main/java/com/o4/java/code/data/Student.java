package com.o4.java.code.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String code;

    public String toString() {
        return "{"+id+", "+name+", "+ code +"}";
    }
}
