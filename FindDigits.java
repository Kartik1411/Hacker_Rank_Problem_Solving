package ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;

public class FindDigits
{
    static int findDigits(int n)
    {
        int count = 0;
        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++)
        {
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));

            if(a > 0)
            {
                if(n % a == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] s = new int[n];

        for (int i = 0; i < s.length; i++)
        {
            s[i] = sc.nextInt();

            System.out.println(findDigits(s[i]));
        }
    }
}
