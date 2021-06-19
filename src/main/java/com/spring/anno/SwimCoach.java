package com.spring.anno;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FotuneService fotuneService;

    @Value("${pj.email}")
    private String email;

    @Value("${pj.team}")
    private String team;

    public SwimCoach(FotuneService fotuneService) {
        this.fotuneService = fotuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim for 20 minutes is good too";
    }

    @Override
    public String getDailyFortune() {
        return fotuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }


    public String getTeam() {
        return team;
    }



    
    
}
