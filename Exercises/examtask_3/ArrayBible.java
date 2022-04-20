/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examtask_3;

/**
 *
 * @author Sumon
 */
public class ArrayBible {

    public static int sumMaxColVal(int[][] arr) {
        int total = 0;
        int max;
        for (int i = 0; i < arr[0].length; i++) {
            max = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            total += max;
        }
        return total;
    }

    public static void rotationArray(int[] arr, int cycle) {
        int tmp;
        while (cycle < 0) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            cycle--;
        }
    }

    public static int[][] transposeMat(int[][] arr) {
        int[][] a = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                a[i][j] = arr[j][i];
            }
        }
        return a;
    }

    public static int[][] matrixMulti(int[][] arr1, int[][] arr2) {
        int[][] newArr = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                newArr[i][j] = 0;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < newArr.length; k++) {
                    newArr[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return newArr;
    }

    void leftRotate(int arr[], int cycle) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < cycle; i++) {
            temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    static void printArray2D(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void getBinary(int num) {
        String binary = "";
        while (num != 0) {
            binary += Character.forDigit(num % 2, 10);
            num = num / 2;
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            System.out.print(binary.charAt(i));
        }
        System.out.println();
    }

    static void getHexa(int num) {
        String binary = "";
        while (num != 0) {
            binary += Character.toUpperCase(Character.forDigit(num % 16, 16));
            num = num / 16;
        }
        for (int i = binary.length() - 1; i >= 0; i--) {
            System.out.print(binary.charAt(i));
        }
        System.out.println();
    }

    static void getDecimalFromHexa(String hexa) {
        int number = Integer.parseInt(hexa);
        int res, x, temp;
        res = x = temp = 0;
        while (number != 0) {
            temp = number % 10;
            res += (int) Math.pow(16, x) * temp;
            number = number / 10;
            x++;
        }
        System.out.println("Res => " + res);
    }

//    public static void main(String[] args) {
    // write your code here
//        int[][] arr1 = new int[][]{{1, 2}, {3, 4}, {5,6}};
//        int[][] arr2 = new int[][]{{1, 3, 5}, {2, 4, 6}};
//        matrixMulti(arr1, arr2);
//        printArray2D(matrixMulti(arr1, arr2));
//        int[][] arre = new int[3][3];
//        arre = transposeMat(arr);
//        printArray2D(arre);
//        int[] arrRev = {1, 2, 3, 4};
//        getBinary(120);
//        getHexa(120);
//        getDecimalFromHexa("78");
//        rotationArray(arrRev, 3);
//        System.out.println(Arrays.toString(arrRev));
//        int res = sumMaxColVal(arr);
//        System.out.println(res);
//        RotateArray rotate = new RotateArray();
    //int arre[] = { 1, 2, 3, 4, 5, 6, 7 };
    // rotate.leftRotate(arre, 2);
//        rotate.printArray(arre, 7);
//    }
}
