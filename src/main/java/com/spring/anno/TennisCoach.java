package com.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
// component default name is tennisCoach , first is lower case

    @Autowired
    @Qualifier("randomFortuneService")
    private FotuneService fotuneService;

    /*
    @Autowired
    public TennisCoach(FotuneService fotuneService) {
        this.fotuneService = fotuneService;
    }
    */
    


    @Override
    public String getDailyWorkout() {

        return "This is work ouut for tennis";
    }

    /*
    @Autowired
    public void doingSomethingUnique(FotuneService fotuneService) {
        this.fotuneService = fotuneService;
    }
    */

    public TennisCoach() {
    }

    @Override
    public String getDailyFortune() {

        return fotuneService.getFortune();
    }
    
    
    public void postConstruct() {
        System.out.println(" it is a post construct");
    }

    
    public void preDestroyed() {
        System.out.println(" this is for pre destroy");
    }
}
