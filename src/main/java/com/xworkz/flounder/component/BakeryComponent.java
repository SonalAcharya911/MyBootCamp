package com.xworkz.flounder.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BakeryComponent {
    @Autowired
    @Qualifier("getFan")
    private Fan fan;

    public BakeryComponent(){
        System.out.println("created BakeryComponent");
    }
}
