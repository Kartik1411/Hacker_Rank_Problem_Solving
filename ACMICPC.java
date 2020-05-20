package ProblemSolving;

import java.util.*;

public class ACMICPC
{
    static int[] acmTeam(String[] topic)
    {
        int[] a = new int[2];


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < topic.length - 1; i++)
        {
            for (int j = i + 1; j < topic.length; j++)
            {
                int count = 0;
                for (int k = 0; k < topic[i].length(); k++)
                {
                    if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1')
                    {
                        count++;
                    }
                }
                list.add(count);
            }
        }

        int d = Collections.max(list);

        int count = 0;
        for (Integer integer : list) {
            if (d == integer) {
                count++;
            }
        }
        a[0] = d;
        a[1] = count;

        return a;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < n; i++)
        {
            String a = sc.nextLine();
            if(a.length() == m)
            s[i] = a;
        }

        int[] last = acmTeam(s);
        String a = Arrays.toString(last);
        System.out.println(a);

    }
}
