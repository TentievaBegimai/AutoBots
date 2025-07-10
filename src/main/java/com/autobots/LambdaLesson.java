package com.autobots;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {

    public static void main(String[] args) {

        MathOperation addition = (a,b) -> a + b;
        MathOperation multi = (a,b) -> a * b;
        System.out.println("5 + 3 = "+ addition.operation(5,3));
        System.out.println("5 * 3 = "+ multi.operation(5,3));

        // Принимает объект , возвращает boolean
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));//false
        System.out.println(isNotEmpty.test("Java"));//true
        // принял int вернул String
        Function<Integer,String> toStringFun = i -> "Число" + i;
        System.out.println(toStringFun.apply(10));//число 10

        Consumer<String> print = s -> System.out.println("Writing "+s);
        print.accept("Hello World"); //Writing Hello World
    }
}
