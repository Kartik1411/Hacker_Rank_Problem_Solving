package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ElectronicsShop
{
    static int getMoneySpent(List<Integer> listKey, List<Integer> listUsb, int b) {
    List<Integer> list = new ArrayList<>();

        for (int i = 0; i < listKey.size(); i++)
        {
            for (int j = 0; j < listUsb.size(); j++)
            {
                int n = listKey.get(i) + listUsb.get(j);
                if(n <= b)
                {
                    list.add(n);
                }
            }
        }


     if(list.isEmpty())
     {
         return -1;
     }
     else
     {
         Collections.sort(list);
         return list.get(list.size()-1);
     }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        int n = sc.nextInt();

        int m = sc.nextInt();

        List<Integer> listKey = new ArrayList<>();
        List<Integer> listUsb = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            listKey.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++)
        {
            listUsb.add(sc.nextInt());
        }

        System.out.println(getMoneySpent(listKey,listUsb,b));

    }
}
