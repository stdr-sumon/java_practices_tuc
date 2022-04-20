/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainexamprac;

/**
 *
 * @author Sumon
 */
public class PracticeArray {
    public int diagonalSum(int[][] arr, String direction) {
        int sum = 0;
        int boundary = arr.length - 1;
        if (direction == "left") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = boundary; j >= 0; j--) {
                    if (boundary == j) {
                        //System.out.println("Val: " + arr[i][j]);
                        sum += arr[i][j];
                    }
                }
                boundary--;
            }
        }
        if (direction == "right") {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        sum += arr[i][j];
                    }
                }
            }
        }
        return sum;
    }
    
    public int diagonalSumOneLoop(int[][] arr, String direction) {
        int sum = 0;
        if (direction == "left") {
            int boundary = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Val: " + arr[i][boundary]);
                sum += arr[i][boundary];
                boundary--;
            }
        }
        if (direction == "right") {
            int boundary = 0;
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Val: " + arr[i][boundary]);
                sum += arr[i][boundary];
                boundary++;
            }
        }
        return sum;
    }
}
