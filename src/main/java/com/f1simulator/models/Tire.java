
package com.f1simulator.models;

public class Tire {

    // Tire compound
    private String compound;

    // Tire information
    private int age;
    private double degradationRate;
    private double initialPerformance;
    private double condition;

    // Constructor
    public Tire(String compound, double degradationRate,
                double initialPerformance) {

        this.compound = compound;
        this.degradationRate = degradationRate;
        this.initialPerformance = initialPerformance;

        this.age = 0;
        this.condition = initialPerformance;
    }

    // Getters
    public String getCompound() {
        return compound;
    }

    public int getAge() {
        return age;
    }

    public double getDegradationRate() {
        return degradationRate;
    }

    public double getInitialPerformance() {
        return initialPerformance;
    }

    public double getCondition() {
        return condition;
    }

    // Increase tire age by one lap
    public void useTire() {
        age++;

        condition -= degradationRate;

        if (condition < 0) {
            condition = 0;
        }
    }

    // Calculate current tire performance
    public double getCurrentPerformance() {

        double performanceLoss = age * degradationRate;

        return Math.max(0, initialPerformance - performanceLoss);
    }

    public double getPerformanceLoss() {

        return initialPerformance - getCurrentPerformance();
    }

    public boolean needsReplacement() {

        return condition <= 30;
    }

    // Display tire information
    public void displayTireInfo() {

        System.out.println("Tire Compound: " + compound);
        System.out.println("Tire Age: " + age + " laps");

        System.out.println("Degradation Rate: "
                + degradationRate);

        System.out.println("Current Performance: "
                + getCurrentPerformance());
    }

    public void displayTireCondition() {

        System.out.println("\n===== TIRE CONDITION =====");

        System.out.println("Compound: " + compound);
        System.out.println("Age: " + age + " laps");
        System.out.println("Condition: " + condition);

        if (needsReplacement()) {
            System.out.println("WARNING: Tires need replacement!");
        } else {
            System.out.println("Tires are in good condition.");
        }
    }
}

