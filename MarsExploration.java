package ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarsExploration
{
    static int marsExploration(String s)
    {

        int count = 0;

        String a = "SOS";

        for (int i = 0; i < s.length() - 2; i = i + 3)
        {

            String q = s.substring(i, i + 3);

            if(!(q.equals(a)))
            {
                for (int j = 0; j < 3; j++)
                {
                    if(q.charAt(j) != a.charAt(j))
                    {
                        count = count + 1;
                    }
                }
            }


        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(marsExploration(s));
    }
}
