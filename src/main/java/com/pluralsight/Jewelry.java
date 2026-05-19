package com.pluralsight;

public class Jewelry extends FixedAsset{
    private final double karat;
    private final double weightPerGrams;

    public Jewelry(String name, double karat, double weightPerGrams) {
        super(name);
        this.karat = karat;
        this.weightPerGrams = weightPerGrams;
    }

    @Override
    public double getValue() {
        double purity = 0.0;
        double goldPricePerGram = 147.08;

        if (this.karat == 24) {
           purity = 10;
        } else if (this.karat == 18) {
            purity = 7.5;
        } else if (this.karat == 14) {
            purity = 5.83;
        } else if (this.karat == 10) {
            purity = 4.17;
        }
        return this.weightPerGrams * purity * goldPricePerGram;
    }
}

