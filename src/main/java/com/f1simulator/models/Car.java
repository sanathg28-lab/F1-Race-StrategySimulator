
package com.f1simulator.models;

public class Car {

    private String model;
    private String constructor;

    private double speedRating;
    private double aerodynamicRating;
    private double reliabilityRating;

    public Car(String model, String constructor,
               double speedRating,
               double aerodynamicRating,
               double reliabilityRating) {

        this.model = model;
        this.constructor = constructor;
        this.speedRating = speedRating;
        this.aerodynamicRating = aerodynamicRating;
        this.reliabilityRating = reliabilityRating;
    }

    public String getModel() {
        return model;
    }

    public String getConstructor() {
        return constructor;
    }

    public double getSpeedRating() {
        return speedRating;
    }

    public double getAerodynamicRating() {
        return aerodynamicRating;
    }

    public double getReliabilityRating() {
        return reliabilityRating;
    }

    public void setSpeedRating(double speedRating) {
        this.speedRating = speedRating;
    }

    public void setAerodynamicRating(double aerodynamicRating) {
        this.aerodynamicRating = aerodynamicRating;
    }

    public void setReliabilityRating(double reliabilityRating) {
        this.reliabilityRating = reliabilityRating;
    }

    public double getOverallPerformance() {

        return (speedRating * 0.40)
                + (aerodynamicRating * 0.35)
                + (reliabilityRating * 0.25);
    }

    public void displayCarInfo() {

        System.out.println("Car Model: " + model);
        System.out.println("Constructor: " + constructor);
        System.out.println("Speed Rating: " + speedRating);
        System.out.println("Aerodynamics: " + aerodynamicRating);
        System.out.println("Reliability: " + reliabilityRating);

        System.out.println("Overall Performance: "
                + getOverallPerformance());
    }
}
