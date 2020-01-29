package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order(final User user, final Product product, final Integer quantity) {
        System.out.println(user.nickname + ", you have ordered " + quantity + " " + product.product + " from " + product.seller);

        return true;
    }

}
