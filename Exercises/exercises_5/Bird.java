/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_5;

/**
 *
 * @author Sumon
 */
public class Bird {
    private String name;
    
    //Comment the prints to see the error in first place;
    
    public Bird(String name) {
        this.name = name;
    }
    
    private void drive() {
        System.out.println(this.name + " is driving in the sky");
        soar();
    }
    
    private void loop() {
        System.out.println(this.name + " is looping in the sky");
        drive();
    }
    
    private void soar() {
        System.out.println(this.name + " is soaring through the sky");
        loop();
    }
    
    public void takeOff() {
        System.out.println(this.name + " is taking off to the sky");
        soar();
    }
}
