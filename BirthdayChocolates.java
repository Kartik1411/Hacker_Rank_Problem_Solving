package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChocolates
{
    static int birthday(List<Integer> s, int d, int m)
    {
        int count = 0;


        for (int i = 0; i < s.size()-m+1; i++)
        {
            int a = 0;
            for (int j = i; j < m+i; j++)
            {
                a = s.get(j) + a;
            }

            if (a == d)
            {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        int d = sc.nextInt();

        int m = sc.nextInt();

        int a = birthday(list,d,m);
        System.out.println(a);
    }
}
