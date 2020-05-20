package ProblemSolving;

import java.util.Scanner;

public class CamelCase
{

    static int camelcase(String s)
    {
        int count = 1;

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 65; j <= 90; j++)
            {
                if((int)s.charAt(i) == j)
                {
                    count = count + 1;
                }
            }
        }

        return count;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(camelcase(s));
    }
}
