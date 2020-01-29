package com.kodilla.good.patterns.challenges;

public class TransactionRequest {

    public User user;
    public Product product;
    public Integer quantity;

    public TransactionRequest(final User user, final Product product, final Integer quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
