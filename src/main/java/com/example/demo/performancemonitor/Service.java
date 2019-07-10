package com.example.demo.performancemonitor;

import org.springframework.stereotype.Component;

import com.example.demo.performancemonitor.LogExecutionTime;

@Component
public class Service {

    @LogExecutionTime
    public void serve() throws InterruptedException {
        Thread.sleep(2000);
    }
}
