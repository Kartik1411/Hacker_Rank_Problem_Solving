package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class HurdleRace
{
    static int hurdleRace(int k, int[] height)
    {
        int doses = 0;

        Arrays.sort(height);

        if(height[height.length-1] > k) {
            doses = height[height.length-1] - k;
        }
        return doses;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < height.length; i++)
        {
            height[i] = sc.nextInt();
        }

        System.out.println(hurdleRace(k,height));
    }
}
