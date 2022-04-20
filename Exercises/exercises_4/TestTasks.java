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
public class TestTasks {
    public static void main(String[] args) {
        int[] oneDimArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] twoDimArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 7, 4, 2}, {2, 2, 2, 1}};
        
        
        Arrayy arrObjj = new Arrayy();
        arrObjj.print(oneDimArr);
        arrObjj.reversePrint(oneDimArr);
        int answer = arrObjj.productDiagonal(arr, 4);
        System.out.println(answer);
        System.out.println("is Ture: " + arrObjj.checkSudoku(twoDimArr));
        System.out.println("is 2d and 1D same: " + arrObjj.checkOneDimWithTwoDim(twoDimArr, oneDimArr));
//        System.out.println("Enter how many hours to store");
//        Scanner consoleInputHours = new Scanner(System.in);
//        int hours = (int) consoleInputHours.nextInt();
//        WeatherStation ws = new WeatherStation(hours);
//        ws.observeWindConsole();
//        ws.printData();
    }
}
