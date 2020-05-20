package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kangaroo
{
    static String kangaroo(long x1, long v1, long x2, long v2)
    {


        for (int i = 0; i < x2; i++)
        {
            if((x1 = x1 + v1) == (x2 = x2 + v2))
            {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        long x1 = scanner.nextLong();

        long v1 = scanner.nextLong();

        long x2 = scanner.nextLong();

        long v2 = scanner.nextLong();

        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
