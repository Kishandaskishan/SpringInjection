package com.annotations;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Swimming for 300 mtrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
