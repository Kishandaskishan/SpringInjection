package com.spring.mavenmca;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice batting for 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
