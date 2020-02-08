package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testPizzaNew() {
        //Given
        BigMac burger = new BigMac.BigMacBuilder()
                .ingredient("onion")
                .bun("non sesame")
                .sauce("barbecue")
                .ingredient("shrimps")
                .ingredient("mushrooms")
                .burgers(2)
                .build();
        System.out.println(burger);
        //When
        int howManyIngredients = burger.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }

}
