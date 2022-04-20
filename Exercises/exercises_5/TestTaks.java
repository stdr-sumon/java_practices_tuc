/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_5;

/**
 *
 * @author Sumon
 */
public class TestTaks {
    public static void main(String[] args) {
//        Bird bird = new Bird("Humming");
//        bird.takeOff();

        int[] oneDimArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] twoDimArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix mtx = new Matrix(3);
        mtx.print();
        Matrix mtx2 = new Matrix(twoDimArr);
        System.out.println();
        mtx2.print();
    }
}
