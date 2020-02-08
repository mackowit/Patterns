package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            if(bun.equals("sesame") || bun.equals("non sesame")) this.bun = bun;
            else throw new IllegalArgumentException("There's no such type of bun!");
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            if(burgers == 1 || burgers == 2) this.burgers = burgers;
            else throw new IllegalArgumentException("You may order 1 or 2 burgers in a bun");
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            if(sauce.equals("standard") || sauce.equals("1000 islands") || sauce.equals("barbecue")) this.sauce = sauce;
            else throw new IllegalArgumentException("There's no such type of sauce!");
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            if(ingredient.equals("salad") || ingredient.equals("onion") || ingredient.equals("becon") || ingredient.equals("cucumber") || ingredient.equals("chilli") || ingredient.equals("mushrooms") || ingredient.equals("shrimps") || ingredient.equals("cheese"))
                ingredients.add(ingredient);
            else throw new IllegalArgumentException("There's no such type of additional ingredient!");
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burgers, sauce, ingredients);
        }

    }

    private BigMac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

}
