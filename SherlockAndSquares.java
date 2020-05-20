package ProblemSolving;

import java.util.Scanner;

public class SherlockAndSquares
{
    static int squares(int a, int b)
    {
        int count = 0;

        for (int i = a; i <= b; i++)
        {
           /* double sq = Math.sqrt(i);

            if(sq - Math.floor(sq) == 0)
            {
                count = count + 1;
            }*/

            long tst = (long)(Math.sqrt(i) + 0.5);
            if( tst*tst == i)
            {
                count = count + 1;
            }
        }


        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(squares(a,b));
        }
    }
}
