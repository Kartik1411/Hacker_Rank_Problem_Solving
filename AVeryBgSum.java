package ProblemSolving;

import java.util.Scanner;

public class AVeryBgSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] ar = new long[n];

        for (int i = 0; i <ar.length ; i++)
        {
            ar[i] = sc.nextLong();
        }
        System.out.println(aVeryBigSum(ar));

    }

    static long aVeryBigSum(long[] ar)
    {
        long sum = 0;
        for (int i = 0; i < ar.length; i++)
        {
            sum = sum + ar[i];
        }

        return sum;

    }
}
