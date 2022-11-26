package com.spring.mavenmca;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
    public static void main(String[] args) {
        //Create the ApplicationContext
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Get the Bean
        CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
        //Call the methods
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeamName());
        //Close the context
        context.close();
    }
}
