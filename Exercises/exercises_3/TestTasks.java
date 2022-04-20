/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_3;

/**
 *
 * @author Sumon
 */
public class TestTasks {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle();
        System.out.print("Radius: " + c1.getRadius() + " Color: " + c1.getColor() + " Area: " + String.format("%.2f \n", c1.getArea()));
        System.out.print("Radius: " + c2.getRadius() + " Color: " + c2.getColor() + " Area: " + String.format("%.2f \n", c2.getArea()));
        System.out.print("Radius: " + c3.getRadius() + " Color: " + c3.getColor() + " Area: ");
        System.out.format("%.2f \n", c3.getArea());
        
        c1.setColor("Sky-Blue");
        System.out.println(c1.getColor());
        System.out.print("Radius: " + c1.getRadius() + " Color: " + c1.getColor() + " Area: ");
        System.out.format("%.2f \n", c1.getArea());
    }
}
