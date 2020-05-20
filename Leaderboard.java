package ProblemSolving;

import java.util.*;

public class Leaderboard
{
    static int[] climbingLeaderboard(int[] scores, int[] alice)
    {
        List<Integer> list = new ArrayList<>();


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < scores.length; i++)
        {
            set.add(scores[i]);
        }

        int[] ar = new int[set.size()];
        int k = 0;
        for (int i: set)
        {
            ar[k++] = i;
        }

        Arrays.sort(ar);


        for (int value : alice)//50 65 77 90 102
        {
            int rank = 1;
            for (int j = ar.length - 1; j >= 0; j--)//100 90 80 75 60
            {
                if (value < ar[0])
                {
                    list.add(ar.length+1);
                }
                else if(value < ar[j])
                {
                    rank++;
                }
                else {
                   list.add(rank);
                }
            }
        }

        int[] last = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
        {
            last[i] = list.get(i);
        }

        return last;

    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = sc.nextInt() ;
        }

        int m = sc.nextInt();

        int[] alice = new int[m];

        for (int i = 0; i < alice.length; i++)
        {
            alice[i] = sc.nextInt();
        }

        int[] last = climbingLeaderboard(scores,alice);

        for (int i = 0; i < last.length; i++)
        {
            System.out.println(last[i]);
        }

    }
}
