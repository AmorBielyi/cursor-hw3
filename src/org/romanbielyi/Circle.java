package org.romanbielyi;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


}
