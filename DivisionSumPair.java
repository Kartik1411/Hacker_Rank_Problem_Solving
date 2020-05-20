package ProblemSolving;

import java.util.Scanner;

public class DivisionSumPair
{
    static int divisibleSumPairs(int n, int k, int[] ar)
    {
        int count = 0;

        for (int i = 0; i < ar.length; i++)//1 3 2 6 1 2
        {
            for (int j = i+1; j < ar.length; j++)
            {
                if((ar[i] + ar[j]) % k == 0)
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i]  = sc.nextInt();
        }

        System.out.println(divisibleSumPairs(n,k,ar));
    }

}
