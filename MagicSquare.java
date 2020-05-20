package ProblemSolving;

import java.util.Scanner;

public class MagicSquare
{
    static int formingMagicSquare(int[][] s)
    {
        int cost = 0;//sum = 15

        for (int i = 0; i < s.length; i++)
            /*        4 9 2

                       3 5 7

                         8 1 5*/
        {

                int n = s[i][0] + s[i][1] + s[i][2];

                    int a = 15 - n;

                        for (int j = 0; j < s.length; j++)
                        {

                             if (s[i][j] < 9 && (s[i][j] + a) <= 9 && (s[0][0] + s[1][1] + s[2][2] != 15) && (s[0][2] + s[1][1] + s[2][0] != 15))
                             {
                                 int m = s[i][j];
                                 s[i][j] = s[i][j] + a;
                                 cost = cost + Math.abs(m - s[i][j]);
                                 break;
                             }
                        }
                    }


        return cost;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[][] s = new int[3][3];

        for (int i = 0; i < s.length; i++)
        {
            for (int j = 0; j < s.length; j++)
            {
                s[i][j] = sc.nextInt();
            }
        }

        System.out.println(formingMagicSquare(s));
    }
}
