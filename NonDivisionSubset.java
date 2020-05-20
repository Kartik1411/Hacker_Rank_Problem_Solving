package ProblemSolving;

import java.sql.ClientInfoStatus;
import java.util.*;

public class NonDivisionSubset
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> s = new ArrayList<>();

        int k = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            s.add(sc.nextInt());
        }

        System.out.println(nonDivisibleSubset(k,s));
    }

    public static int nonDivisibleSubset(int k, List<Integer> s)
    {
        int ans = 0;
        for(int i=1;i<=k/2;i++)
        {
            if(i*2==k)
                ans+=1;
            else
            {
                ans+=Math.max(s.get(i), s.get(k-i));
            }
        }
        if(s.get(0) != 0)
            ans+=1;
        return ans;

    }
}
