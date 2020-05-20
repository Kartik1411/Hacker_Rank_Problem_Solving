package ProblemSolving;

import java.util.Scanner;

public class QueensAttack
{
    static int queensAttack(int n, int k, int r_q, int c_q, char[][] obstacles) {
        int count = 0;

        for (int i = r_q + 1; i < obstacles.length; i++) {
            if (obstacles[i][c_q] != 'o') {
                count = count + 1;
            } else {
                break;
            }
        }

        //System.out.println(count + "***");
        for (int i = r_q - 1; i > 0; i--) {
            if (obstacles[i][c_q] != 'o') {
                count = count + 1;
            } else {
                break;
            }
        }
        //System.out.println(count + "***");

        for (int i = c_q - 1; i > 0; i--) {
            if (obstacles[r_q][i] != 'o') {
                count = count + 1;
            } else {
                break;
            }
        }
        //System.out.println(count + "***");


        for (int i = c_q + 1; i < obstacles.length; i++) {
            if (obstacles[r_q][i] != 'o') {
                count = count + 1;
            } else {
                break;
            }
        }

        //System.out.println(count + "***");


        int l = c_q - 1;

        for (int i = r_q - 1; i > 0; i--)
        {

            while (l > 0)
            {

                if (obstacles[i][l] != 'o')
                {
                    count = count + 1;
                    l--;
                    //System.out.println(count + " cou ");
                    break;
                }
            }
        }


       //System.out.println(count + "***");

        int j = c_q - 1;

        for (int i = r_q + 1; i < obstacles.length; i++)
        {
            while (j > 0)
            {

                if (obstacles[i][j] != 'o')
                {
                    count = count + 1;
                    j--;
                    //System.out.println(count + " cou ");
                    break;
                }
            }
        }

        //System.out.println(count + "***");

        int m = c_q + 1;
        for (int w = r_q - 1; w > 0; w--)
        {
            while (m < obstacles.length)
            {
                if (obstacles[w][m] != 'o')
                {
                    count = count + 1;
                    m++;
                //    System.out.println(count + " cou ");
                    break;
                }
            }
        }
        //System.out.println(count + "***");


        int e = c_q + 1;
        for (int r = r_q + 1; r < obstacles.length; r++)
        {
            while (e < obstacles.length)
            {

                if (obstacles[r][e] != 'o')
                {
                    count = count + 1;
                    e++;
                    //System.out.println(count + " cou ");
                    break;
                }
            }

        }
            return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int r_q = sc.nextInt();

        int c_q = sc.nextInt();

        char[][] obstacles = new char[n + 1][n + 1];

        obstacles[r_q][c_q] = 'q';

        for (int i = 0; i < k; i++)
        {
            obstacles[sc.nextInt()][sc.nextInt()] = 'o';
        }

        /*for (int c = 1; c <= n; c++)
        {
            for (int r = 1; r <= n; r++)
            {
                System.out.print(obstacles[r][c] + " ");
            }
            System.out.println();
        }*/
        System.out.println(queensAttack(n,k,r_q,c_q,obstacles));
    }
}
