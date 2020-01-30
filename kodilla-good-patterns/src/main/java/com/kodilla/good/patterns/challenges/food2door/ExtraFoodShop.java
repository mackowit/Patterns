package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements SupplierOrderProcessor {

    @Override
    public boolean process() {
        System.out.println("Welcome at ExtraFoodShop. Your order is being completed!!");
        return true;
    }

    @Override
    public String getName() {
        return "ExtraFoodShop";
    }
}
