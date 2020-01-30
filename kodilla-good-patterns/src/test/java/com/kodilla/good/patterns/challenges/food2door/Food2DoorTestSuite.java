package com.kodilla.good.patterns.challenges.food2door;

import org.junit.Test;

public class Food2DoorTestSuite {
    @Test
    public void testExtraFoodShop() {
        //Given
        SupplierOrderProcessor testShop = new ExtraFoodShop();
        OrderRequest testRequest = new OrderRequest("mackowit", testShop.getName(), "carrots", 2);
        //boolean testOrderSupplierProcess = testShop.process();
        //When & Then
        OrderProcessor testOrder = new OrderProcessor(testRequest, testShop);
        testOrder.transaction();
    }

    @Test
    public void testHealthyShop() {
        //Given
        SupplierOrderProcessor testShop = new HealthyShop();
        OrderRequest testRequest = new OrderRequest("jozek1948", testShop.getName(), "broccoli", 1);
        //boolean testOrderSupplierProcess = testShop.process();
        //When & Then
        OrderProcessor testOrder = new OrderProcessor(testRequest, testShop);
        testOrder.transaction();
    }
}
