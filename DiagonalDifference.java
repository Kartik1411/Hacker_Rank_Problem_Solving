package ProblemSolving;

import java.util.Scanner;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] ar = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }

        System.out.println(diagonalDifference(ar));



    }

    public static int diagonalDifference(int[][] ar)
    {
            int sum1 = 0;
            int sum2 = 0;

        for (int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar.length; j++)
            {
                if(i == j)
                {
                    sum1 = sum1 + ar[i][j];
                }

                if(i == ar.length-j-1)
                {
                    sum2 = sum2 + ar[i][j];
                }
            }
        }


        if(sum1 >= sum2)
        {
            return (sum1-sum2);
        }
        else
        {
            return (sum2-sum1);
        }

    }
}
