package com.spring.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);

        SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getEmail());

        System.out.println(coach.getTeam());

        context.close();
    }
}
