/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_5;

/**
 *
 * @author Sumon
 */
public class Matrix {
    private int[][] numbers;

    public Matrix(int size) {
        this.numbers = new int[size][size];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == 0){
                    if (j == 0) {
                        this.numbers[i][j] = 1;
                    } else {
                        this.numbers[i][j] = this.numbers[i][j-1] + 1;
                    }
                } else {
                    this.numbers[i][j] = this.numbers[i-1][j] * 2;
                }
            }
        }
    }
    
    public Matrix(int[][] orginalArr) {
        this.numbers = new int[orginalArr.length][orginalArr.length];
        for (int i = 0; i < orginalArr.length; i++) {
            for (int j = 0; j < orginalArr.length; j++) {
                this.numbers[i][j] = (orginalArr[i][j] * 2);
            }
        }
    }
    
    public void print() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print("[" + this.numbers[i][j] + "]");
            }
            System.out.println();
        }
    }
}
