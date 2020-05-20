package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers
{
    public static int pickingNumbers(List<Integer> a)
    {
        int count = 0;

        Collections.sort(a);

        for (int i = 0; i < a.size()-1; i++)
        {
            if(a.get(i).equals(a.get(i + 1)))
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            ar.add(sc.nextInt());
        }

        System.out.println(pickingNumbers(ar));
    }
}
