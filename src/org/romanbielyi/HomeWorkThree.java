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


        //Task 4
        System.out.println("TASK #4");
        double d = 515.7655;
        StrangeFraction strangeFraction = new StrangeFraction(d);
        System.out.printf("The integer part of the %.4f is %d\n", d, strangeFraction.getIntegerPart());
        System.out.printf("The fraction part of the %.4f is %d\n", d, strangeFraction.getFractionPart());
        System.out.printf("The sum of the parts is: %d\n", strangeFraction.getSumOfParts());
        System.out.printf("The difference of the parts is: %d\n", strangeFraction.getDiffOfParts());
        System.out.printf("The product of the parts is: %d\n", strangeFraction.getProductOfParts());
        System.out.printf("Is integer part > fraction one: %b\n", strangeFraction.isIntegerPartBigger());
        System.out.printf("Is fraction part > integer one: %b\n", strangeFraction.isFractionPartBigger());
        System.out.printf("Are parts equal: %b\n", strangeFraction.arePartsEqual());

        //Task 5
        System.out.println("TASK #5");
        double money = 1024.0008;
        StrangeMoney strangeMoney = new StrangeMoney(money);
        strangeMoney.printPrettyMoney();
        System.out.printf("The sum of the money is: %d\n", strangeMoney.getSum());
        System.out.printf("The difference of the money is: %d\n", strangeMoney.getDiff());
        System.out.printf("The quotient of the money is: %f\n", strangeMoney.getFraction());
        System.out.printf("The quotient of the money sum by 5.4 is: %f\n", strangeMoney.getFractionBy(5.4));
        System.out.printf("The product of the money by 11.23 is: %f\n", strangeMoney.getProductBy(11.23));
        System.out.printf("Are bills more than coins: %b\n", strangeMoney.areBillsGreaterThanCoins());
        System.out.printf("Are coins more than bills: %b\n", strangeMoney.areCoinsGreaterThanBills());
        System.out.printf("Are bills equal coins: %b\n", strangeMoney.areTheyEqual());
    }
}
