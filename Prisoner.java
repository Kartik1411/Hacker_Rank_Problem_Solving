package ProblemSolving;

import java.util.Scanner;

public class Prisoner
{
    static int saveThePrisoner(int n, int m, int s)
    {
        int count = 1;

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = count;
            count++;
        }

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == s)
            {
                int k = i;
                while(k < n)
                {
                    k++;
                    m--;
                }

                if(m != 1 && ar[k] == ar[ar.length])
                {

                }

            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int n = sc.nextInt();

            int m = sc.nextInt();

            int s = sc.nextInt();

            System.out.println(saveThePrisoner(n,m,s));
        }
    }
}
