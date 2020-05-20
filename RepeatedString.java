package ProblemSolving;

import java.util.Scanner;

public class RepeatedString
{
    static long repeatedString(String s, long n)
    {
       /* long a = 0;

        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = 0; i < n - s.length(); i++)
        {
            sBuilder.append(sBuilder.charAt(i));
        }

        s = sBuilder.toString();


        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                a++;
            }
        }

        return a;*/

       long count = s.length() - s.replace("a", "").length();
       long reps = n/s.length();
       long rest = n%s.length();

       count = count*reps;

       for(int i = 0; i < rest; i++){
            if(s.charAt(i) == 'a')
                count++;
        }
       return count;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        long n = sc.nextLong();

        System.out.println(repeatedString(s,n));
    }
}
