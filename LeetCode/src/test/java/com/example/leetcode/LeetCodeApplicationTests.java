package com.example.leetcode;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootTest
class LeetCodeApplicationTests {



    @Test
    void contextLoads() {
    }


    @Test
    public void test1(){
        Consumer<String> consumer = s -> System.out.println(s);

        printnum("aaa",consumer);

        Supplier<String> supplier =new Supplier<String>() {
            @Override
            public String get() {
                return "1";
            }
        };


        Function<Double,Long> function = new Function<Double,Long>() {
            @Override
            public Long apply(Double aFloat) {
                return Math.round(aFloat);
            }
        };

        System.out.println(function.apply(12.3));

    }

    @Test
    public void test2(){
        List<Integer> list = Lists.newArrayList(1,2,3,6,4,5);
        list.stream().map(Long::new).reduce(Long::sum);
    }


    public void printnum(String str,Consumer<String> consumer){
        consumer.accept(str);
    }

    public void merge(){
        int b = 1 + 2;
        int a = 3 + 4;
        int c = 5 + 6;
        System.out.println("主分支master");
    }
}
