package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class RunableABC  implements CommandLineRunner {

    private String message;
    @Autowired
    APIHolderClient apiHolderClient;

    // standard logger, constructor

    @Override
    public void run(String... args) throws Exception {
        DemoEntity  e = new DemoEntity();
        e.setAvatar("1212");
        System.out.println("content");
        String res =apiHolderClient.getAccount(e);
        System.out.println(res);
    }
}