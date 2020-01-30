package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements SupplierOrderProcessor {
    @Override
    public boolean process() {
        System.out.println("Your gluten free order is coming to you right away!!");
        return true;
    }

    @Override
    public String getName() {
        return "GlutenFreeShop";
    }
}
