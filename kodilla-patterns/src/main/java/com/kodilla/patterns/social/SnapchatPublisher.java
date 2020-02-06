package com.kodilla.patterns.social;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String whereToPublish() {
        return "Snapchat! This is only what really matters.";
    }
}
