package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbersEmpty = new ArrayList<Integer>();
        System.out.println("Given: " + numbersEmpty);
        //When
        ArrayList<Integer> result;
        result = new OddNumbersExterminator().exterminate(numbersEmpty);
        System.out.println("When: " + result);
        //Then
        Assert.assertEquals(numbersEmpty, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbersFull = new ArrayList<Integer>();
        numbersFull.add(1);
        numbersFull.add(2);
        numbersFull.add(3);
        numbersFull.add(4);
        numbersFull.add(5);
        System.out.println("Given: " + numbersFull);
        //When
        ArrayList<Integer> result;
        result = new OddNumbersExterminator().exterminate(numbersFull);
        System.out.println("When: " + result);
        //Then
        ArrayList<Integer> numbersEven = new ArrayList<Integer>();
        numbersEven.add(2);
        numbersEven.add(4);
        Assert.assertEquals(numbersEven, result);
    }
}
