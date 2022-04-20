package assignment4;

public class Task1{
	//Method required
    public static int productDiagonals(int [][] arr, int N) 
    {
        int result = 1;
	int j = N - 1;
        for(int i = 0; i < N; i++)
        {
            result = result * arr[i][i] * arr[i][j];
	    j = j - 1;
        }
        if(N % 2 == 1)
        {
            result = result / arr[N/2][N/2];
        }
        return result;
    }
}