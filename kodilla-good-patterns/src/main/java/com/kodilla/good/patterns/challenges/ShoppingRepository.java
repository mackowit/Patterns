package com.kodilla.good.patterns.challenges;

public class ShoppingRepository implements TransactionRepository {
    @Override
    public boolean createTransaction(User user, Product product, Integer quantity) {
        System.out.println("Transaction has been created. " + user.nickname + " " + product.product + " " + quantity + " pcs.");
        return true;
    }
}
