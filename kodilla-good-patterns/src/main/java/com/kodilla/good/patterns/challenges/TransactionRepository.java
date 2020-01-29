package com.kodilla.good.patterns.challenges;

public interface TransactionRepository {
    public boolean createTransaction(User user, Product product, Integer quantity);
}
