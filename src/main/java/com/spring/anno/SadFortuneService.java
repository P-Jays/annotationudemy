package com.spring.anno;

public class SadFortuneService implements FotuneService {

    @Override
    public String getFortune() {
        return "today is still normal day, but i still love u baby haha";
    }
    
}
