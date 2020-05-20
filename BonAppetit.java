package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit
{
    static void bonAppetit(List<Integer> bill, int k, int b)
    {
        int sum = 0;

        for (int i = 0; i < bill.size(); i++)
        {
            if(i != k)
            {
                sum = sum + bill.get(i);
            }
        }

        int ba = sum / 2;

        if(ba == b)
        {
            System.out.println("Bon Appetit");
        }

        else
        {
            System.out.println(b-ba);
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        int b = sc.nextInt();

        bonAppetit(list,k,b);
    }
}
