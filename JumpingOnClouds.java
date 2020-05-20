package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnClouds
{
    static int jumpingOnClouds(int[] c)
    {

        /*for (int i = 0; i < c.length; i++)
        {
            System.out.println(i+ " " + c[i]);
        }
        System.out.println();*/

        int count = -1;
        for (int i = 0; i < c.length; i++, count++) {
            if (i< c.length-2 && c[i+2]==0) i++;
        }


        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] c = new int[n];

        for (int i = 0; i < c.length; i++)
        {
            c[i] = sc.nextInt();
        }

        System.out.println(jumpingOnClouds(c));
    }
}
