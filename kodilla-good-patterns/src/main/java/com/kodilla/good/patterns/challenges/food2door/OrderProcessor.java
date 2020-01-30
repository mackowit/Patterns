package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    OrderRequest request;
    SupplierOrderProcessor shop;

    public OrderProcessor(OrderRequest request, SupplierOrderProcessor shop) {
        this.request = request;
        this.shop = shop;
    }

    boolean supplierOrder = shop.process();

    public void transaction() {
        if (supplierOrder) System.out.println(request.user + ", you ordered: " + request.quantity + " " + request.product + " from " + request.shop);
        else System.out.println("We're sorry. Your order cannot be completed");
    }
}
