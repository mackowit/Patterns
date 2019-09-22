package com.kodilla.stream.beautyfier;

public class PoemBeautyfier {
    public void beautify(String poemToDecorate, PoemDecorator decorator) {
        String decoratedPoem = decorator.decorate(poemToDecorate);
        System.out.println(decoratedPoem);
    }
}
