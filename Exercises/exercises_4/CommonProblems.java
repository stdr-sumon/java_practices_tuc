/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_4;

/**
 *
 * @author Sumon
 */
public class CommonProblems {
    public static boolean numberCheck(int num) {
        boolean isCube = false;
        int sum = 0;
        int paramVal = num;
        int remainder = 0;
        while (num != 0) {
            remainder = num % 10;
            num = num / 10;
            sum += (remainder * remainder * remainder);
        }
        if (sum == paramVal) {
            isCube = true;
        }
        return isCube;
    }
}
