package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks
{
    static int[] cutTheSticks(int[] arr)
    {
        int[] last = new int[arr.length];

        return last;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] last = cutTheSticks(arr);

        for (int i = 0; i < last.length; i++)
        {
            if(last[i] != 0)
            System.out.println(last[i]);
        }
    }
}
