package com.jack.jvmcase.controller;

import com.jack.jvmcase.domain.Worker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeapController {

    List<Worker> list = new ArrayList<Worker>();

    @GetMapping("/heap")
    public String heap() throws Exception {
        while (true) {
//            Thread.sleep(10);
            list.add(new Worker());
        }
    }

}
