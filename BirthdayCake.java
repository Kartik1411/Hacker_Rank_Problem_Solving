package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCake
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
    }

    static int birthdayCakeCandles(int[] ar)
    {
        Arrays.sort(ar);
        int n = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[ar.length-1] == ar[i])
            {
                n = n + 1;
            }
        }

        return n;
    }
}
