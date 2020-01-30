package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    String user;
    String shop;
    String product;
    Integer quantity;

    public OrderRequest(String user, String shop, String product, Integer quantity) {
        this.user = user;
        this.shop = shop;
        this.product = product;
        this.quantity = quantity;
    }

    public String getUser() {
        return user;
    }

    public String getShop() {
        return shop;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
