package ProblemSolving;

import java.util.Scanner;

public class PlusMinus
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

        plusMinus(ar);
    }

    static void plusMinus(int[] ar)
    {
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] > 0 )
            {
                plus = plus + 1;
            }

            else if(ar[i] < 0)
            {
                minus = minus + 1;
            }
            else
            {
                zero = zero + 1;
            }
        }

        double p = (double)plus/ar.length;
        double m = (double) minus/ar.length;
        double z = (double)zero/ar.length;

        System.out.printf("%.06f",p);
        System.out.println();
        System.out.printf("%.06f",m);
        System.out.println();
        System.out.printf("%.06f",z);

    }

}
