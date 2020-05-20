package ProblemSolving;

import java.util.HashSet;
import java.util.Scanner;

public class DrawingBook
{
    static int pageCount(int n, int p)//5 4
    {

        int countFront = 0;
        int countLast = 0;

        int[] ar = new int[2];

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        if(set.contains(p))
        {
            ar[0] =  countFront;
        }
        else
        {
            countFront++;

            for (int i = 2; i <= n; i = i + 2)
            {

                set.add(i);
                set.add(i + 1);
                if (!set.contains(p)) {
                    ar[0] = countFront + 1;
                }
                else
                {
                    ar[0] = countFront;//1
                }
            }
        }

        HashSet<Integer> set1 = new HashSet<>();

        if(n % 2 == 0)
        {
            set1.add(n);

            if(set1.contains(p))
            {
                ar[1] = countLast;
            }

            else
            {

                ar[1] = countLast + 1;

                for (int i = n-1; i <= 1; i = i - 2)
                {
                    set1.add(i);
                    set1.add(i-1);

                    if(set1.contains(p))
                    {
                        ar[1] = countLast;

                    }
                    else
                    {
                        ar[1] = countLast + 1;

                    }
                }
            }
        }
        else
        {
            for (int i = n; i <= 1 ; i = i - 2)
            {
                set1.add(i);
                set1.add(i-1);
                if(!set1.contains(p))
                {
                    ar[1] = countLast + 1;
                }
                else
                {
                    ar[1] = countLast;
                    break;
                }
            }
        }




       return Math.min(ar[0],ar[1]);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int p = sc.nextInt();

        System.out.println(pageCount(n,p));
    }

}
