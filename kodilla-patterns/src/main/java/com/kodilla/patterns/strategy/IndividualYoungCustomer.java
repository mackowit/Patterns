package com.kodilla.patterns.strategy;

public class IdividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggresivePredictor();
    }
}
