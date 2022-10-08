package com.example.leetcode.equals;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Smith517
 * @Date 2022/9/1 22:03
 * @Version 1.0
 * @Describe TODO
 */
public class Test {
    public static void main(String[] args) {
        Student student1 =new Student();
        Student student2 =new Student();
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        HashMap<Student,String> map =new HashMap<Student,String>();
        map.put(student1,"123");
        map.put(student2,"456");
        System.out.println(map.get(student1));
        System.out.println(map.get(student2));
        HashSet<Student> set =new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        System.out.println(set.size());
    }
}
