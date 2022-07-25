package com.jack.jvmcase.stack;

public class StackOverFlowDemo {

    public static long count = 0;

    public static void method() {
        System.out.println(count++);
        method();
    }

    public static void main(String[] args) {
        method();
    }

}
