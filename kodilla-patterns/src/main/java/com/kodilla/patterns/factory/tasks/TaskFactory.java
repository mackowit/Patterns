package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Bananas shopping", "bananas", 1.5);
            case PAINTING:
                return new PaintingTask("Blue walls painting", "red", "walls");
            case DRIVING:
                return new DrivingTask("Motorcycle ride", "picnic", "Harley");
            default:
                return null;
        }

    }

}
