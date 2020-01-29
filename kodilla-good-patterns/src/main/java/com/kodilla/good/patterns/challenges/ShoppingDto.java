package com.kodilla.good.patterns.challenges;

public class ShoppingDto {
    public User user;
    public boolean isTransactionSucceed;

    public ShoppingDto(final User user, final boolean isTransactionSucceed) {
        this.user = user;
        this.isTransactionSucceed = isTransactionSucceed;
    }

    public User getUser() {
        return user;
    }

    public boolean isTransactionSucceed() {
        return isTransactionSucceed;
    }
}
