package com.spring.mavenmca;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Bowling for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("inside email setter method");
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        System.out.println("inside team setter method");
        this.teamName = teamName;
    }
}
