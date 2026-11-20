package com.f1simulator;

import com.f1simulator.models.Car;
import com.f1simulator.models.Circuit;
import com.f1simulator.models.Driver;
import com.f1simulator.models.Tire;
import com.f1simulator.simulation.RaceSimulator;

public class Main {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("     F1 RACE STRATEGY SIMULATOR");
        System.out.println("==================================");

        System.out.println("Initializing F1 Simulator...");
        System.out.println("Project successfully started!");

        // Create car
        Car mclarenCar = new Car(
                "MCL39", "McLaren", 96, 95, 92
        );

        // Create driver
        Driver driver = new Driver(
                "Lando Norris", 4, "McLaren", mclarenCar
        );

        // Create tire
        Tire mediumTire = new Tire(
                "MEDIUM",
                0.07,
                100
        );

        driver.setTire(mediumTire);

        // Create circuit
        Circuit circuit = new Circuit(
                "Texas Grand Prix Circuit",
                "Austin, USA",
                5.5,
                20,
                56
        );

        // Simulate 10 laps of tire usage
        for (int i = 0; i < 10; i++) {
            mediumTire.useTire();
        }

        // Display driver information
        driver.displayDriverInfo();

        // Display car information
        mclarenCar.displayCarInfo();

        // Display tire information
        System.out.println("\n--- TIRE INFORMATION ---");
        mediumTire.displayTireInfo();

        // Display circuit information
        System.out.println("\n--- CIRCUIT INFORMATION ---");
        circuit.displayCircuitInfo();

        // Create race simulator
        RaceSimulator simulator = new RaceSimulator(circuit);

        // Add driver
        simulator.addDriver(driver);

        // Start race
        simulator.startRace();
    }
}

