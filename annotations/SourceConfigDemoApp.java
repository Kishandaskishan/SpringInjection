package com.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SourceConfigDemoApp {
    public static void main(String[] args) {
        //Create the Object Factory
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SportConfig.class);
        //Get the Bean
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        //Call the Methods using Beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //Close the Context
        context.close();
    }
}
