package assignment4;

public class Task2{
	//Method required
    public static int[] search(int [][] arr, int n, int element) {
        int[] empty = {};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == element) {
                     return int[] { i, j };
                }
            }
        }
        return empty;
    }
}