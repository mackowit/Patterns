package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testWorldPeopleQuantity() {
        //Given
        Continent testCountryList = new Continent();
        testCountryList.addCountry(new Country());
        testCountryList.addCountry(new Country());
        testCountryList.addCountry(new Country());
        testCountryList.addCountry(new Country());

        World testContinentList = new World();
        testContinentList.addContinent(testCountryList);
        testContinentList.addContinent(testCountryList);

        //When
        BigDecimal testTotalPeopleQuantity = testContinentList.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("80000000");
        Assert.assertEquals(testTotalPeopleQuantity, expected);
    }
}
