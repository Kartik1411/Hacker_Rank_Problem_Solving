package ProblemSolving;

import java.util.Scanner;

public class BreakingTheRecords
{
    static int[] breakingRecords(int[] scores)
    {
        int[] last = new int[2];

        int highest = scores[0];
        int lowest = scores[0];

        int hiCount = 0;
        int lowCount = 0;

        for (int i = 0; i < scores.length; i++)
        {
            if(highest < scores[i])
            {
                highest = scores[i];
                hiCount++;
            }

            if(lowest > scores[i])
            {
                lowest = scores[i];
                lowCount++;
            }
        }

        last[0] = hiCount;
        last[1] = lowCount;

        return last;

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = sc.nextInt();
        }

        int[] a = breakingRecords(scores);

        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
