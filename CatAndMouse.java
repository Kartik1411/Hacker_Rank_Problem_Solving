package ProblemSolving;

import java.util.Scanner;

public class CatAndMouse
{
    static String catAndMouse(int x, int y, int z)
    {
        if(Math.abs(x - z) > Math.abs(y - z))
        {
            return "Cat B";
        }
        else if(Math.abs(x - z ) < Math.abs(y - z))
        {
            return "Cat A";
        }

        else
        {
            return "Mouse C";
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextByte();

        for (int i = 0; i < q; i++)
        {
            int x = sc.nextInt();

            int y = sc.nextInt();

            int z = sc.nextInt();

            System.out.println(catAndMouse(x,y,z));
        }
    }
}
