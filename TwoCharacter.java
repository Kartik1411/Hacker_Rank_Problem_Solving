package ProblemSolving;

import java.util.*;

public class TwoCharacter
{
    static int alternate(String s)
    {

        char[] a = s.toCharArray();

        Set<Character> set = new HashSet<>();

        for (char c : a)
        {
            set.add(c);
        }

        char[] q = new char[set.size()];

        int i = 0;
            for (char x : set)
            {
            q[i++] = x;
        }

        List<String> str = new ArrayList<>();


        for (int j = 0; j < q.length - 1; j = j + 2)
        {
            String m = "";

            for (int k = 0; k < s.length(); k++)
            {
                if(q[j] != s.charAt(k) && q[j + 1] != s.charAt(k))
                {
                    m = m + s.charAt(k);
                    str.add(m);
                }
            }
        }


        List<String> list = new ArrayList<>();

        for (int j = 0; j < str.size(); j++)
        {
            String d = str.get(i);

            Set<Character> set1 = new HashSet<>();

            for (int k = 0; k < d.length(); k++)
            {
                set1.add(d.charAt(k));
            }

            if(set1.size() > 2)
            {
                return 0;
            }

            else
            {
                String f = "";

                for (int k = 0; k < d.length() - 1; k++)
                {
                    if(d.charAt(k) != d.charAt(k + 1))
                    {
                        f = f + d.charAt(k) + d.charAt(k + 1);
                    }
                }

                list.add(f);
            }
        }

        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();

        System.out.println(alternate(s));
    }
}
