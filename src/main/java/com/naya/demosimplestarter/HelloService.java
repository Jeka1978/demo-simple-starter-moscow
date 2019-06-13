package com.naya.demosimplestarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
public class HelloService {

    @Autowired
    private UserDetails userDetails;

    @Scheduled(fixedDelay = 500)
    public void sayHello(){
        System.out.println("Hello "+userDetails.getName());
    }
}
