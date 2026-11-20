
package com.f1simulator.simulation;

import com.f1simulator.models.*;

import java.util.*;

public class RaceSimulator {

    private Circuit circuit;
    private List<Driver> drivers;
    private int currentLap;
    private Random random;
    private Map<Driver, Double> totalTimes;

    public RaceSimulator(Circuit circuit) {
        this.circuit = circuit;
        this.drivers = new ArrayList<>();
        this.currentLap = 0;
        this.random = new Random();
        this.totalTimes = new HashMap<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
        totalTimes.put(driver, 0.0);
    }

    public void startRace() {

        System.out.println("\n================================");
        System.out.println("       F1 RACE STARTING");
        System.out.println("================================");

        System.out.println("Circuit: " + circuit.getName());
        System.out.println("Total Laps: " + circuit.getNumberOfLaps());

        for (int lap = 1; lap <= circuit.getNumberOfLaps(); lap++) {
            currentLap = lap;
            simulateLap();
        }

        displayResults();
    }


    private void simulateLap() {
        System.out.println("\n--- LAP " + currentLap + " ---");

        for (Driver driver : drivers) {

            // Calculate this lap's time
            double lapTime = calculateLapTime(driver);

            // Add lap time to the driver's total
            double currentTotal = totalTimes.get(driver);
            totalTimes.put(driver, currentTotal + lapTime);

            // Display lap information
            System.out.printf(
                    "%s | Lap Time: %.3f seconds | Tire Age: %d | Tire Condition: %.2f%n",
                    driver.getName(),
                    lapTime,
                    driver.getTire().getAge(),
                    driver.getTire().getCondition()
            );

            // Wear the tires after completing the lap
            driver.getTire().useTire();

            // Automatically pit on lap 25
            if (currentLap == 25) {

                Tire newTire = new Tire("SOFT", 0.12, 100);

                PitStop pitStop = new PitStop(2.5, newTire);

                pitStop.performPitStop(driver);

                // Add pit-stop time to total race time
                double updatedTotal = totalTimes.get(driver);
                totalTimes.put(
                        driver,
                        updatedTotal + pitStop.getPitStopTime()
                );
            }
        }
    }



    private double calculateLapTime(Driver driver) {

        Car car = driver.getCar();
        Tire tire = driver.getTire();

        // Calculate car performance
        double performance = car.getOverallPerformance();

        // Calculate base lap time
        double baseTime = 100 + (circuit.getLength() * 5);

        // Account for car performance
        double performanceAdjustment = (100 - performance) * 0.15;

        // Calculate tire degradation penalty
        double tirePenalty =
                (100 - tire.getCurrentPerformance()) * 0.5;

        // Add random variation
        double randomVariation = random.nextDouble() * 1.5;

        return baseTime + performanceAdjustment
                + tirePenalty + randomVariation;
    }

    private void displayResults() {
        System.out.println("\n================================");
        System.out.println("          RACE FINISHED");
        System.out.println("================================");

        for (Driver driver : drivers) {
            System.out.printf(
                    "%s | Total Race Time: %.3f seconds%n",
                    driver.getName(),
                    totalTimes.get(driver)
            );
        }
    }
}
