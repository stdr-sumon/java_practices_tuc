/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_4;

/**
 *
 * @author Sumon
 */
public class Arrayy {
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public void reversePrint(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public boolean checkSudoku(int[][] arr) {
        int counter = 1;
        boolean isCorrect = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (counter != arr[i][j]) {
                    isCorrect = false;
                }
                ++counter;
            }
        }
        return isCorrect;
    }
    
    public boolean checkOneDimWithTwoDim(int[][] twoDimArr, int[] oneDimArr) {
        boolean isCorrect = true;
        int oneDimArrIndex = 0; 
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                if (oneDimArr[oneDimArrIndex] != twoDimArr[i][j]) {
                    isCorrect = false;
                }
                ++oneDimArrIndex;
            }
        }
        return isCorrect;
    }
    
    //Without common element
    public int diagonalProduct(int[][] arr, String direction) {
        int result = 1;  
        int size = arr.length; 
        
        if (direction.equals("left")) {
            for (int i = 0; i < size; i++) {
                for (int j = size; j >= 0; j--) {
                    if (size == j) {
                        result *= arr[i][j];
                    }
                }
                size--;
            }
        }
        
        if (direction.equals("right")) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) {
                        result *= arr[i][j];
                    }
                }
            }
        }             
        
        return result;
    }
    
    public int productDiagonal (int[][] arr, int size) {
        int result = diagonalProduct(arr, "left") * diagonalProduct(arr, "right");
        if(size % 2 == 1) {
	    int commonIndex = size / 2;
            result = result / arr[commonIndex][commonIndex];
        }
        return result;
    }
    
    //Assignment 4
    public int[] searchInArray(int[][] arr, int size, int element) {
        int[] arrEmpty = {};     
        int row = 0; 
        int col = size - 1;
        while(row < size && col >= 0) {
            if (arr[row][col] == element) {
                return new int[] {row, col};
            }
            if (arr[row][col] < element) { 
                row = row + 1;
            } else {
                col--;
            }
        }
        return arrEmpty;
    }
    
}
