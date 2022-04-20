/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises_1_2;

/**
 *
 * @author Sumon
 */
public class Exercise_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void bmiCategory(double weight, double height) {
        double bmi = weight / (height*height);
        
        if (bmi > 30.0) {
            System.out.println("Obese");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        } else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
        } else {
            System.out.println("Under Weight");
        }
        
    }
    
    public static void findGrade(int n) {
        if (n < 0 || n > 100) {
            System.out.println("Invalid score");
            return;
        }
        n = (n >= 90) ? 90 : n;
        int rem = (n / 10);
        switch(rem) {
            case 9: 
                System.out.println("A");
                break;
            case 8: 
                System.out.println("B");
                break;
            case 7: 
                System.out.println("C");
                break;
            case 6: 
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
        }
    }
    public static void findReverse(int n) {
        int rem = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            System.out.print(rem);
        }
        System.out.println();
    }
    public static int returnReverse(int n) {
        int number = 1;
        int rem = 0;
        int counter = 0;
        /* 
            Another Solution
            while (n != 0) {
                number = (number * 10) + (n % 10 );
                n = n / 10;
            }
        */
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            if (counter % 2 == 0) {
                if (counter == 0) {
                    number = rem * 10;
                } else {
                    number = (number * 10) + rem;
                }
            } else {
                if (counter == 1) {
                    number += rem;
                } else {
                    number = (number * 10) + rem;
                }
            }
            ++counter;
        }
        return number;
    }
    public static void sumOfSeries(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i; 
        }
        System.out.println("Sum = " + sum);
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        bmiCategory(75.0, 1.5);
//        bmiCategory(45, 1.37);
//        findGrade(101);
//        findReverse(1234);
//        sumOfSeries(5);
//        System.out.println("Revers is: " + returnReverse(102));
//    }
    
}
