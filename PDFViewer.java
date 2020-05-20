package ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PDFViewer
{
    static int designerPdfViewer(int[] h, String word)
    {
        Map map = new HashMap();
        int j = 97;
        for (int i = 0; i < h.length; i++)
        {

            if(j < 123)
            {
                map.put(j, h[i]);
                j++;
            }

        }

        char[] ch = word.toCharArray();//abc
        int[] ar = new int[ch.length];

        for (int i = 0; i < ch.length; i++)
        {
            ar[i] = (int)ch[i];
        }


        int[] a = new int[ar.length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int)map.get(ar[i]);
        }



        Arrays.sort(a);

        return  word.length()*a[a.length-1];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[26];

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
        sc.nextLine();

        String s = sc.nextLine();

        System.out.println(designerPdfViewer(ar,s));
    }
}
