package ProblemSolving;

import java.util.Scanner;

public class Encryption
{
    static void encryption(String s)
    {
        int len = s.length();

        int row = (int)Math.floor(Math.sqrt(len));

        int column = (int)Math.ceil(Math.sqrt(len));




    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        encryption(s);
    }
}
