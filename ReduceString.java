package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceString
{
    static String superReducedString(String s)
    {
        List<Character> list = new ArrayList<>();

        int i = 0;

        if(s.length() == 1)
        {
            return s;
        }
        else
        {
            while (i < s.length() - 1)
            {
                if(s.charAt(i) != s.charAt(i + 1))
                {
                    list.add((s.charAt(i)));
                    i++;
                }
                else
                {
                    i = i + 2;
                    if(i == s.length() - 1)
                    {
                        list.add(s.charAt(i));
                    }
                }
            }
        }

        if(list.isEmpty())
        {
            return "Empty String";
        }


        StringBuilder sb = new StringBuilder();
        for (Character c : list)
        {
            sb.append(c);
        }

        int count = 0;

        for (int j = 0; j < sb.length() - 1; j++)
        {
            if(sb.charAt(j) == sb.charAt(j + 1))
            {
                count = count + 1;
            }
        }

        if(count == 0)
        {
            return sb.toString();
        }

        List<Character> list1 = new ArrayList<>();

        int j = 0;

        if(sb.length() == 1)
        {
            return sb.toString();
        }
        else
        {
            while (j < sb.length() - 1)
            {
                if(sb.charAt(j) != sb.charAt(j + 1))
                {
                    list.add((sb.charAt(j)));
                    j++;
                }
                else
                {
                    j = j + 2;
                    if(j == sb.length() - 1)
                    {
                        list1.add(sb.charAt(i));
                    }
                }
            }
        }

        if(list1.isEmpty() && !list.isEmpty())
        {
            return "Empty String";
        }


        StringBuilder sb1 = new StringBuilder();
        for (Character c : list1)
        {
            sb1.append(c);
        }


        return sb1.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(superReducedString(s));
    }
}
