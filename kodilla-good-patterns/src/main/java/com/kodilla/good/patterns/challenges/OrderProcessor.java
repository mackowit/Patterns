package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ShoppingRepository shoppingRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final ShoppingRepository shoppingRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.shoppingRepository = shoppingRepository;
    }

    public ShoppingDto process(final TransactionRequest transactionRequest) {
        boolean isTransactionCompleted = productOrderService.order(transactionRequest.getUser(), transactionRequest.getProduct(), transactionRequest.getQuantity());

        if(isTransactionCompleted) {
            informationService.inform(transactionRequest.getUser());
            shoppingRepository.createTransaction(transactionRequest.getUser(), transactionRequest.getProduct(), transactionRequest.getQuantity());
            return new ShoppingDto(transactionRequest.getUser(), true);
        } else {
            return new ShoppingDto(transactionRequest.getUser(), false);
        }
    }
}
