
package com.f1simulator.models;

public class RaceStrategy {

    private String strategyName;
    private Tire startingTire;
    private int pitStops;
    private int pitLap;

    // Constructor
    public RaceStrategy(String strategyName, Tire startingTire,
                        int pitStops, int pitLap) {
        this.strategyName = strategyName;
        this.startingTire = startingTire;
        this.pitStops = pitStops;
        this.pitLap = pitLap;
    }

    // Getters
    public String getStrategyName() {
        return strategyName;
    }

    public Tire getStartingTire() {
        return startingTire;
    }

    public int getPitStops() {
        return pitStops;
    }

    public int getPitLap() {
        return pitLap;
    }

    // Display strategy information
    public void displayStrategy() {
        System.out.println("Strategy: " + strategyName);
        System.out.println("Starting Tire: " + startingTire);
        System.out.println("Planned Pit Stops: " + pitStops);
        System.out.println("Pit Lap: " + pitLap);
    }
}

