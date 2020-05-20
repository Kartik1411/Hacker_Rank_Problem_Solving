package ProblemSolving;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendAndDelete
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String t = sc.nextLine();

        int k = sc.nextInt();

        System.out.println(appendAndDelete(s,t,k));
    }

    static String appendAndDelete(String s, String t, int k) {
        char[] q = s.toCharArray();
        char[] w = t.toCharArray();




      /*  for (int i = 0; i < q.length; i++)
        {
            System.out.print(q[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < w.length; i++)
        {
            System.out.print(w[i] + " ");
        }
        System.out.println();*/

        int count = 0;
        int l = 0;

        List<Character> a = new ArrayList<>();

        if(w.length < q.length)
        {
        for (int i = 0; i < w.length; i++) {
            if (q[i] == w[i]) {
                a.add(q[i]);
                count = i;
            } else {
                count = i;
                break;
            }
        }

        if (k <  (q.length - a.size())) {
            return "No";
        }


       /* System.out.println(count);
        
        for (int i = 0; i < a.size(); i++)
        {
            System.out.print(a.get(i));
        }
        System.out.println();*/

       else if(a.size() == w.length)
        {
            return "Yes";
        }

        //System.out.println(k);

        else
        {
            l = k - (q.length - a.size());
            for (int i = l; i >= 0 && count < w.length; i--, count++) {
                a.add(w[count]);
            }


       /* for (int i = 0; i < a.size(); i++)
        {
            System.out.print(a.get(i));
        }
        System.out.println();*/

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) != w[i])
                    return "No";
            }


            return "Yes";
        }
    }
        else
        {
            for (int i = 0; i < q.length; i++) {
                if (q[i] == w[i]) {
                    a.add(w[i]);
                    count = i;
                } else {
                    count = i;
                    break;
                }
            }

            if (k <  (q.length - a.size())) {
                return "No";
            }


       /* System.out.println(count);

        for (int i = 0; i < a.size(); i++)
        {
            System.out.print(a.get(i));
        }
        System.out.println();*/

            //System.out.println(k);

            else
            {
                l = k - (q.length - a.size());
                for (int i = l; i >= 0 && count < w.length; i--, count++) {
                    a.add(w[count]);
                }


       /* for (int i = 0; i < a.size(); i++)
        {
            System.out.print(a.get(i));
        }
        System.out.println();*/

                for (int i = 0; i < a.size(); i++) {
                    if (a.get(i) != w[i])
                        return "No";
                }


                return "Yes";
            }
        }
    }

}
