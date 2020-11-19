package org.romanbielyi;

import java.math.BigDecimal;
import java.util.SortedMap;

public class HomeWorkThree {

    public static void main(String[] args) {

        // Task  1
        System.out.println("TASK #1: get area of circle");
        Circle circle = new Circle(12);
        System.out.println(circle.getArea());

        // Task 2
        System.out.println("TASK #2: instance counter");
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println(InstanceCounter.getCounter());

        // Task 3
        System.out.println("TASK #3: car");
        Car car = new Car("BMW");
        car.turnOnCarEngine();
        car.increaseSpeed(65.5f);
        car.showCarStatus();
        car.decreaseSpeed(31);
        car.showCarStatus();
        car.decreaseSpeed(50);
        car.showCarStatus();
        car.increaseSpeed(15.8f);
        car.showCarStatus();
        car.increaseSpeed(100);
        car.showCarStatus();
        car.increaseSpeed(80);
        car.showCarStatus();
        car.decreaseSpeed(180);
        car.showCarStatus();
        car.stop();
        car.showCarStatus();
        car.turnOffCarEngine();
    }
}
