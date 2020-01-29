package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Confirmation email has been sented to the user: " + user.nickname);
    }
}
