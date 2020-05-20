package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long [] ar = new long[5];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

        miniMaxSum(ar);

    }

    static void miniMaxSum(long[] ar)
    {

        Arrays.sort(ar);





        long minSum = 0;
        for (int i = 0; i < ar.length-1; i++)
        {
            minSum = minSum + ar[i];
        }

        long maxSum = 0;
        for (int i = 1; i < ar.length; i++)
        {
            maxSum = maxSum + ar[i];
        }

        System.out.println(minSum +" "+maxSum);
    }

}
