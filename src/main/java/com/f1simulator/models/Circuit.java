
package com.f1simulator.models;

public class Circuit {

    // Circuit information
    private String name;
    private String location;
    private double length;
    private int numberOfTurns;
    private int numberOfLaps;

    // Constructor
    public Circuit(String name, String location,
                   double length, int numberOfTurns,
                   int numberOfLaps) {

        this.name = name;
        this.location = location;
        this.length = length;
        this.numberOfTurns = numberOfTurns;
        this.numberOfLaps = numberOfLaps;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getLength() {
        return length;
    }

    public int getNumberOfTurns() {
        return numberOfTurns;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }

    // Calculate total race distance
    public double getTotalRaceDistance() {
        return length * numberOfLaps;
    }

    // Display circuit information
    public void displayCircuitInfo() {

        System.out.println("Circuit Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Track Length: " + length + " km");
        System.out.println("Number of Turns: " + numberOfTurns);
        System.out.println("Number of Laps: " + numberOfLaps);

        System.out.println("Total Race Distance: "
                + getTotalRaceDistance() + " km");
    }
}
