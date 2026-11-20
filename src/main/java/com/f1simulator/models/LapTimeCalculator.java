package com.f1simulator.models;

public class LapTimeCalculator {

    // Calculate lap time using car and tire performance
    public static double calculateLapTime(Car car, Tire tire) {

        double baseLapTime = 100 - (car.getOverallPerformance() * 0.1);

        double performanceLoss =
                tire.getInitialPerformance() - tire.getCurrentPerformance();

        double tirePenalty = performanceLoss * 0.05;

        return baseLapTime + tirePenalty;
    }
}
