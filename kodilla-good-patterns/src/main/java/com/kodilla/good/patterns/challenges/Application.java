package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

        ShoppingRequestRetriever shoppingRequestRetriever = new ShoppingRequestRetriever();
        TransactionRequest transactionRequest = shoppingRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ShoppingRepository());
        orderProcessor.process(transactionRequest);
    }

}
