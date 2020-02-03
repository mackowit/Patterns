package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    OrderRequest request;
    SupplierOrderProcessor shop;


    public OrderProcessor(OrderRequest request, SupplierOrderProcessor shop) {
        this.request = request;
        this.shop = shop;
    }

    public void transaction(boolean supplierOrder) {
        if (supplierOrder) System.out.println(request.user + ", you ordered: " + request.quantity + " " + request.product + " from " + request.shop);
        else System.out.println("We're sorry. Your order cannot be completed");
    }
}
