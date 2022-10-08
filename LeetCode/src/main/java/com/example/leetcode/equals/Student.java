package com.example.leetcode.equals;

import java.util.Objects;

/**
 * @Author Smith517
 * @Date 2022/9/1 22:01
 * @Version 1.0
 * @Describe TODO
 */
public class Student {
    private String name;
    private int age;
    private String QQ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(QQ, student.QQ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, QQ);
    }
}
