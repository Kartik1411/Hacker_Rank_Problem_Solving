package ProblemSolving;

import java.util.Scanner;

public class TomBday
{
    public static long taumBday(long b, long w, long bc, long wc, long z)// 3 5 3 4 1
    {
        long cost = 0;

        if(bc == wc && bc == z)
        {
            cost = cost + (b*bc + w * wc);
        }
        else if(bc >= wc + z)
        {
            long totalToys = b + w;
            cost = cost + (totalToys * wc + b * z);
        }

        else if(wc >= bc + z)
        {
            long totalToys = b + w;
            cost = cost + (totalToys * bc + w * z);
        }

        else if(z > bc || z > wc)
        {
            cost = cost + (b * bc + w* wc);
        }
        else
        {
            long a = b * bc + w * wc;
            if(bc > wc)
            {
                long totalToys = b + w;
                cost = cost + (totalToys * wc + b * z);
                if(cost > a)
                {
                    cost = a;
                }
            }

            else if(wc > bc)
            {
                long totalToys = b + w;
                cost = cost + (totalToys * bc + w * z);
                if(cost > a)
                {
                    cost = a;
                }
            }
        }


        return cost;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++)
        {
            int b = sc.nextInt();
            int w = sc.nextInt();
            int bc = sc.nextInt();
            int wc = sc.nextInt();
            int z = sc.nextInt();


            System.out.println(taumBday(b,w,bc,wc,z));
        }
    }
}
