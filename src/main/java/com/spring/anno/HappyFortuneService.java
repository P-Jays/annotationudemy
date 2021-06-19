package com.spring.anno;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FotuneService{

    @Override
    public String getFortune() {

        return "You are very lucky today!";
    }
    
}
