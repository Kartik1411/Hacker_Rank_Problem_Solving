package ProblemSolving;


import java.util.Scanner;

public class SequenceEquation
{
    static int[] permutationEquation(int[] p)
    {
        int a = p.length + 1;

        int[] q = new int[a];

        for (int i = 1,j = 0; i < q.length && j < p.length; i++,j++)
        {
            q[i] = p[j];
        }

        int b = p.length;

        int[] last = new int[a];

        for (int i = 1; i < q.length && b >= 1; i++, b--)
        {
            if(b == q[i])
            {
                for (int j = 1; j < q.length; j++)
                {
                    if(i == q[j])
                    {
                        last[i] = j;
                        break;
                    }
                }
            }
        }

        return last;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] p = new int[n];

        for (int i = 0; i < p.length; i++)
        {
            p[i] = sc.nextInt();
        }

        int[] a = permutationEquation(p);

        for (int i = a.length-1; i >= 1; i--)
        {
            System.out.println(a[i]);
        }
    }
}
