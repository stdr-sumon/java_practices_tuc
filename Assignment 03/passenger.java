/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package sepb.assignment_three;
import java.util.Scanner;

/**
 *
 * @author Sumon
 */
public class passenger {

    /**
     *
     * @param inputArray copy of passed array
     */
    public static int[] queue (int[] inputArray) {
        int arrLength = inputArray.length;
        //Return array when elemnt is less than two
        if (arrLength < 2) {
            return inputArray;
        }
        // Dividing array into two half 
        int midPos = arrLength / 2;
        int [] leftHalfArr = new int[midPos];
        int [] rightHalfArr = new int[arrLength - midPos];
        //Taking left half from input array
        for (int i = 0; i < midPos; i++) { 
            leftHalfArr[i] = inputArray[i];
        }
        //Taking right half from input array
        for (int i = midPos; i < arrLength; i++) {
            // i - midPos because we want to start the array index of rightHalfArr from 0
            rightHalfArr[i - midPos] = inputArray[i];
        }
        // Divide 'recursively' the left and right half array until it becomes to signle element array
        queue(leftHalfArr);
        queue(rightHalfArr);
        
        // Merge from the single element sorted array to up
        int[] sortArr = new int[inputArray.length];
        sortArr = mergeArray(inputArray, leftHalfArr, rightHalfArr);
        
        return sortArr;
    }
    
    /**
     *
     * @param sortedArr for keeping sorted array
     * @param leftHalf
     * @param rightHalf
     * @return sortedArr as sorted array
     */
    public static int[] mergeArray (int[] sortedArr, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;
        // When left half and right half have elements
        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                sortedArr[k] = leftHalf[i];
                i++;
            } else {
                sortedArr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        // When right half finishes
        while (i < leftHalf.length) {
            sortedArr[k] = leftHalf[i];
            i++;
            k++;
        }
        // When left half finishes
        while (j < rightHalf.length) {
            sortedArr[k] = rightHalf[j];
            j++;
            k++;
        }
        return sortedArr;
    }
    
    public static void main(String[] args) {
        int n;  
        System.out.println("How many seat do you want to order: ");
        Scanner sc = new Scanner(System.in);    
        //reading the number of elements for array 
        n = sc.nextInt(); 
        sc.nextLine();
        //creates an array in the memory of length n  
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the array: ");  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }  
        arr = queue(arr);
        System.out.println("\nAfter Sorting:");
        for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
        }
    }
}
