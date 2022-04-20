/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_4;

import java.util.Scanner;

/**
 *
 * @author Sumon
 */
public class WeatherStation {

    private int hours;
    private Wind[] windData;

    public WeatherStation(int hours) {
        this.hours = hours;
        this.windData = new Wind[hours];
    }

    public void observeWind() {
        for (int i = 0; i < this.hours; i++) {
            //Math.random() take value as double between 0.0 and 1.0 
            int speed = (int) (Math.random() * Wind.MAX_SPEED);
            int direction = (int) (Math.random() * Wind.MAX_DIRECTION);
            //Storing Data
            this.windData[i] = new Wind(speed, direction);
        }
    }
    
    public void observeWindConsole() {
        Scanner consoleInput = new Scanner(System.in);
        for (int i = 0; i < this.hours; i++) {
            System.out.print("Enter speed data nr. " + (i+1) + " = ");
            int speed = (int) (consoleInput.nextInt());
            
            while(speed > Wind.MAX_SPEED || speed < 0) {
                System.out.println();
                System.out.print("Windspeed is not valid. Max 200 and Min 0. Try again for nr." + (i+1) + " = ");
                speed = (int) (consoleInput.nextInt());
            }            
            System.out.println();
            System.out.print("Enter direction data nr. " + (i+1) + " = ");
            
            int direction = (int) (consoleInput.nextInt());
            while(direction > Wind.MAX_DIRECTION || direction < 0) {
                System.out.println();
                System.out.print("Direction is not valid. Max 360 and Min 0. Try again for nr." + (i+1) + " = ");
                direction = (int) (consoleInput.nextInt());
            }
            System.out.println();
            //Storing Data
            this.windData[i] = new Wind(speed, direction);
        }
    }

    public void printData() {
        for (int i = 0; i < this.windData.length; i++) {
            System.out.print("Wind speed is " + this.windData[i].getSpeed());
            System.out.println("km/h and the direction is " + this.windData[i].getDirection());
        }
    }
}
