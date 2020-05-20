package ProblemSolving;

import java.util.Scanner;

public class BeautifulDays
{
    static int beautifulDays(int i, int j, int k)//    20 23 6
    {
        int count = 0;

        int[] days = new int[j-i+1];

        for (int l = 0; l < days.length && i <= j; l++,i++)
        {
            days[l] = i;
        }


        int[] revDays = new int[days.length];


        for (int l = 0; l < revDays.length; l++)
        {
            int reversed = 0;
            int a = days[l];
            while(a != 0) {

                int digit = a % 10;
                reversed = reversed * 10 + digit;
                a /= 10;

                revDays[l] = reversed;
            }
        }



        for (int l = 0; l < days.length; l++)
        {
            int n = Math.abs(days[l] - revDays[l]);

            if (n % k == 0) {
                count++;
            }
        }


        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        int j = sc.nextInt();

        int k = sc.nextInt();

        System.out.println(beautifulDays(i,j,k));
    }
}
