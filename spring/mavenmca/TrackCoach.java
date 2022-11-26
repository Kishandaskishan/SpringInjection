package com.spring.mavenmca;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "run 10km everyday";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
