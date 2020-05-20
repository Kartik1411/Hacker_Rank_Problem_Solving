package ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StrongPass
{
    static int minimumNumber(int n, String password)
    {
        int count = 0;

        Set<Character> set = new HashSet<>();

        if(n < 6)
         {
            return 6 - n;
         }

        for (int i = 0; i < password.length(); i++)
        {
            set.add(password.charAt(i));
        }

        String s = set.toString();

        int cap = 0;

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 65; j <= 90; j++)
            {
                if((int)s.charAt(i) == j)
                {
                    break;
                }
                else 
                {
                    cap = i;
                }
            }
        }

        int low = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            for (int j = 97; j <= 122 ; j++)
            {
                if((int)s.charAt(i) == j)
                {
                    break;
                }
                else
                {
                    low = i;
                }
            }
        }

        int num = 0;

        for (int i = 0; i < s.length(); i++)
        {
            for (int j = 48; j <= 57; j++)
            {
                if((int)s.charAt(i) == j)
                {
                    break;
                }

            }

        }

        System.out.println(num);

        int sp = 0;

        for (int i = 0; i < s.length(); i++)//!@#$%^&*()-+
        {
            if(s.charAt(i) == '!' || s.charAt(i) == '@' || s.charAt(i) == '#' || s.charAt(i) == '$' || s.charAt(i) == '%' || s.charAt(i) == '^' || s.charAt(i) == '&' ||
                    s.charAt(i) == '*' || s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '-' || s.charAt(i) == '+')
            {
                break;
            }
            else
            {
                sp = i;
            }
        }

        if(cap >= s.length())
        {
            count = count + 1;
        }
        if (low >= s.length())
        {
            count = count + 1;
        }
        if(num >= s.length())
        {
            count = count + 1;
        }
        if(sp >= s.length())
        {
            count = count + 1;
        }

        return count;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        System.out.println(minimumNumber(n,s));
    }
}
