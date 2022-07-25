package com.jack.jvmcase.loader;

import com.jack.jvmcase.domain.Worker;

public class Demo {

    public static void main(String[] args) {
        // AppClassLoader
        System.out.println(new Worker().getClass().getClassLoader());
        // ExtClassLoader
        System.out.println(new Worker().getClass().getClassLoader().getParent());
        // Bootstrap ClassLoader，因为是c++写的，所以打印出来是null
        System.out.println(new Worker().getClass().getClassLoader().getParent().getParent());
        // Bootstrap ClassLoader，因为是c++写的，所以打印出来是null
        System.out.println(new String().getClass().getClassLoader());
    }

}