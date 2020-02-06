package com.kodilla.patterns.social;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String publish() {
        return socialPublisher.whereToPublish();
    }

    public void setSocialToPublish(SocialPublisher socialPublisher) {
                this.socialPublisher = socialPublisher;
    }
}
