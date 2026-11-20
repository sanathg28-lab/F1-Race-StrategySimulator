
package com.f1simulator.models;

public class Driver {

    // Driver information
    private String name;
    private int driverNumber;
    private String team;

    // Car assigned to the driver
    private Car car;
    private Tire tire;

    // Constructor
    public Driver(String name, int driverNumber, String team, Car car) {
        this.name = name;
        this.driverNumber = driverNumber;
        this.team = team;
        this.car = car;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public String getTeam() {
        return team;
    }

    public Car getCar() {
        return car;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    // Display driver information
    public void displayDriverInfo() {
        System.out.println("Driver: " + name);
        System.out.println("Number: " + driverNumber);
        System.out.println("Team: " + team);
        System.out.println("Car: " + car.getModel());
    }
}

