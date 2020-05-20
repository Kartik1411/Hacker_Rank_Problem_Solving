package ProblemSolving;

import java.util.Scanner;

public class Football
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

       String s1 = "1111111";

       String s2 = "0000000";

       if(s.contains(s1) || s.contains(s2))
       {
           System.out.println("YES");
       }

       else
       {
           System.out.println("NO");
       }
    }
}
