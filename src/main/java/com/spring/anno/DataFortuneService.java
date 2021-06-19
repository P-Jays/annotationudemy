package com.spring.anno;

import org.springframework.stereotype.Component;

@Component
public class DataFortuneService implements FotuneService {

    @Override
    public String getFortune() {
        return null;
    }
    
}
