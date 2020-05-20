package ProblemSolving;

import java.util.Scanner;

public class ArrayRotation
{
    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int[] q = new int[queries.length];

        for (int i = 0; i < k; i++)
        {
                int last = a[a.length-1];
                for (int l = a.length-1; l > 0 ; l--)
                {
                    a[l] = a[l-1];
                }

                a[0] = last;


        }

        for (int i = 0; i < queries.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                if(queries[i] == j)
                {
                    q[i] = a[j];
                }
            }
        }
       return q;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int q = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int[] b = new int[q];

        for (int i = 0; i < b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        int[] c = circularArrayRotation(a,k,b);

        for (int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
}
