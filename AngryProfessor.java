package ProblemSolving;

import java.util.Scanner;

public class AngryProfessor
{
    static String angryProfessor(int k, int[] a)
    {
        String s = "YES";
        int count = 0;

        for (int value:a)
        {
            if (value <= 0)
            {
                count++;
            }
        }



        if(count >= k)
        {
            return s = "NO";
        }
        return s;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            int  n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++)
            {
                a[j] = sc.nextInt();
            }

            System.out.println(angryProfessor(k,a));
        }
    }
}
