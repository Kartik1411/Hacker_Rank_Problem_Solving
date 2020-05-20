package ProblemSolving;

import java.util.*;

public class CompareTheTriplets
{
    public static void main(String[] args)
    {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
        {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < 3; i++)
        {
            b.add(sc.nextInt());
        }

        List<Integer> c = compareTriplets(a,b);
        for (int i = 0; i < c.size(); i++)
        {
            System.out.print(c.get(i)+" ");
        }
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b)
    {

        List<Integer> last = new ArrayList<>();
        int A = 0;
        int B = 0;

        for (int i = 0; i < a.size(); i++)
        {
            if(a.get(i) > b.get(i))
            {
                A = A + 1;
            }

            else if(b.get(i) > a.get(i))
            {
                B = B + 1;
            }

        }
        last.add(A);
        last.add(B);
        return last;
    }
}
