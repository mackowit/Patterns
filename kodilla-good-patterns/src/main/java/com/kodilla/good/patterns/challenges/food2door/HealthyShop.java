package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements SupplierOrderProcessor{
    @Override
    public boolean process() {
        System.out.println("We invite you to our HealthyShop world!! Be healthy with us!!");
        return true;
    }

    @Override
    public String getName() {
        return "HealthyShop";
    }
}
