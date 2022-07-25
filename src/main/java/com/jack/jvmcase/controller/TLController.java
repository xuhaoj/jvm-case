package com.jack.jvmcase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TLController {
    @GetMapping(value = "/tl")   // 每个客户端的请求会对应一个ThreadLocal   并发量大了，考虑一下 内存泄露导致的内存溢出
    // java -jar -Xms2000M -Xmx2000M -XX:+HeapDumpOnOutOfMemoryError -XX:DumpPath= jvm.case.jar
    public String tl(HttpServletRequest request) {
        ThreadLocal<Byte[]> tl = new ThreadLocal<Byte[]>();
        tl.set(new Byte[1024*1024]);
        return "ok";
    }
}
