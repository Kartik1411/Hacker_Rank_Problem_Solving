package ProblemSolving;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class BetweenTwoSets
{
    public static int getTotalX(List<Integer> a, List<Integer> b)
    {




        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        int r = 0;
        int w = a.get(a.size()-1);

        int e = b.get(0);

        while (r < e)
        {
            r = w + r;
            list.add(r);
        }

       /* for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();*/

        for (Integer integer : list) {
            for (Integer value : a) {
                int count1 = 0;
                if (integer % value == 0) {
                    count1 = count1 + 1;
                }
                else
                {
                    break;
                }
                if(count1 == a.size())
                {
                    set.add(integer);
                }

            }
        }

        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();

      /*  for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();*/

        for (int value : arr) {
            int count2 = 0;
            for (Integer integer : b) {

                if (integer % value == 0)
                {
                    count2 = count2 + 1;
                }
                else
                {
                    break;
                }

                if(count2 == b.size())
                {
                    set1.add(value);
                }
            }
        }

/*        int[] arr1 = set1.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();*/

        return set1.size();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++)
        {
            b.add(sc.nextInt());
        }

        System.out.println(getTotalX(a,b));
    }
}
