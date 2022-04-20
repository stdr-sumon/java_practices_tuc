/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_3;

/**
 *
 * @author Sumon
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.color = "orange";
    }
    
    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
