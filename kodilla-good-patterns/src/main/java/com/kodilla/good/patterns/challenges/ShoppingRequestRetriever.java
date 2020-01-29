package com.kodilla.good.patterns.challenges;

public class ShoppingRequestRetriever {

    public TransactionRequest retrieve() {

        User user = new User("mackowit");
        Product product = new Product("Wycieraczki Ford Focus MK2", "jozek1948");
        Integer quantity = 1;

        return new TransactionRequest(user, product, quantity);
    }
}
