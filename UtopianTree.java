package ProblemSolving;

import java.util.Scanner;

public class UtopianTree
{
    static int utopianTree(int n)
    {


        if(n == 0)
            return 1;
        else if(n == 1)
        {
            return 2;
        }
        else if(n % 2 == 0)
        {
            n--;
            return utopianTree(n)+1;
        }
        else
        {
            n--;
            return utopianTree(n)*2;
        }


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println(utopianTree(sc.nextInt()));
        }
    }
}
