package ProblemSolving;

import java.util.*;

public class SockMerchant
{
    static int sockMerchant(int n, int[] ar)
    {
        int count = 0;


        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < ar.length; i++)
        {
            set.add(ar[i]);
        }


        List<Integer> list = new ArrayList<>(set);


        for (int i = 0; i < list.size(); i++)
        {
            int pairs = 0;
            for (int j = 0; j < ar.length; j++)
            {
                if(list.get(i) == ar[j])
                {
                    pairs++;
                }
            }

            if(pairs == 1)
            {
                continue;
            }

            else if(pairs % 2 == 0)
            {
                count = count + pairs / 2;
            }

            else
            {
                count = count + (pairs - 1) / 2;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }

        System.out.println(sockMerchant(n,ar));
    }
}
