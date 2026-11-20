package com.f1simulator.models;

public class PitStop {

    private double pitStopTime;
    private Tire newTire;

    public PitStop(double pitStopTime, Tire newTire) {
        this.pitStopTime = pitStopTime;
        this.newTire = newTire;
    }

    public double getPitStopTime() {
        return pitStopTime;
    }

    public Tire getNewTire() {
        return newTire;
    }

    public void performPitStop(Driver driver) {

        System.out.println("\n" + driver.getName()
                + " is entering the pit lane!");

        System.out.println("Changing tires...");

        // PUT IT HERE
        driver.setTire(newTire);

        System.out.println("New tires: "
                + newTire.getCompound());

        System.out.println("Pit stop completed in "
                + pitStopTime + " seconds.");
    }
}

