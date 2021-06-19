package com.spring.anno;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FotuneService {

    private String[] data = {
        "This is PJ luckiest day",
        "this is My lucky day too",
        "it is always my luckiest day"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {
        int randomNum = random.nextInt(data.length);
        return data[randomNum];
    }
    
}
