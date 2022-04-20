/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_4;

/**
 *
 * @author Sumon
 */
public class Wind {

    private int speed;
    private int direction;
    
    final static int MAX_SPEED = 200;
    final static int MAX_DIRECTION = 360;

    public Wind(int speed, int direction) {
        this.speed = (speed > MAX_SPEED) ? MAX_SPEED : speed;
        this.direction = (direction > MAX_DIRECTION) ? MAX_DIRECTION : direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }

}
