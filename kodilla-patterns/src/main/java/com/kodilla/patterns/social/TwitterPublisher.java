package com.kodilla.patterns.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String whereToPublish() {
        return "Only Twitter, man!";
    }
}
