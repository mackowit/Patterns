package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    public void testGetAverage() {
        //Given
        //ArrayOperations arrayOperationsTest = new ArrayOperations();

        int[] testArray = {1, 20, 3, 8, 10, 12, 22, 23, 43, 55, 3, 12, 43, 9, 56, 30, 12, 3, 0, 10};

        //When
        double testAverage = ArrayOperations.getAverage(testArray);

        //Then
        Assert.assertEquals(18.75, testAverage, 0);
    }
}
