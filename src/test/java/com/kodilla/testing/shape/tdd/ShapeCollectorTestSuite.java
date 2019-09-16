package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();

            //When
            shapes.addFigure(new Circle(5));

            //Then
            Assert.assertEquals(1, shapes.numberOfFigures());
        }

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Shape theShape = new Square(5);
            shapes.addFigure(theShape);

            //When
            String retrievedShape;
            retrievedShape = shapes.getFigure(0);

            //Then
            Assert.assertEquals(theShape.getShapeName(), retrievedShape);
        }

        @Test
        public void testRemoveFigureNotExisting() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Shape theShape = new Square(5);

            //When
            boolean result = shapes.removeFigure(theShape);

            //Then
            Assert.assertFalse(result);
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapes = new ShapeCollector();
            Shape theShape = new Triangle(5);
            shapes.addFigure(theShape);

            //When
            boolean result = shapes.removeFigure(theShape);

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, shapes.numberOfFigures());
        }
}
