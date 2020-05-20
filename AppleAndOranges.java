package ProblemSolving;

import java.util.Scanner;

public class AppleAndOranges
{

        static void countApplesAndOranges(int s, int t, int a, int b, Double[]apples, Double[] oranges)
        {

            int ap = 0;
            int or = 0;

            for (int i = 0; i < apples.length; i++)
            {
                apples[i] = apples[i] + a;
                if(apples[i] >= s && apples[i] <= t)
                {
                    ap = ap + 1;
                }
            }

            for (int i = 0; i < oranges.length; i++)
            {
                oranges[i] = oranges[i] + b;
                if(oranges[i] <= t && oranges[i] >= s)
                {
                    or = or + 1;
                }
            }


            System.out.println(ap);
            System.out.println(or);
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        Double[] apples = new Double[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            Double applesItem = Double.parseDouble(applesItems[i]);
            apples[i] = applesItem;
        }

        Double[] oranges = new Double[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            Double orangesItem = Double.parseDouble(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }

}
