package ProblemSolving;

import java.util.Scanner;

public class ViralAd
{
    static int viralAdvertising(int n)
    {
        int share = 5;
        int like = share / 2;
        int cumulative = 2;
        for (int i = 1; i < n; i++)
        {
            share = like * 3;
            like = share / 2;

            cumulative = cumulative + like;
        }

        return cumulative;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(viralAdvertising(n));
    }
}
