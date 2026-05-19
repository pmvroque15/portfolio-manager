package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getValue() {
        double goldPricePerGram = 147.08;
        return this.weight * goldPricePerGram;
    }
}
