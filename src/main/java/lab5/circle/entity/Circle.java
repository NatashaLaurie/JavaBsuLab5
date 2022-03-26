package lab5.circle.entity;

import lab5.point.entity.Point;

import java.util.Objects;

public class Circle implements Cloneable, Comparable<Circle> {
    private int radius;
    private Point center;
    private double area;
    private double circumference;

    {
        center = new Point(0, 0);
        radius = 0;
        area = 0;
        circumference = 0;
    }

    public Circle() {

    }

    public Circle(int radius, Point center) {
        this.center = center;
        setRadius(radius);
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }

    public Circle(int radius) {
        setRadius(radius);
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("radius should be positive");
        }
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                ", center = " + center +
                ", area = " + String.format("%.2f", area) +
                ", circumference = " + String.format("%.2f", circumference) +
                '}' + "\n";
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public int compareTo(Circle o) {
        return this.radius - o.radius;
    }
}
