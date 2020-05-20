package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudent
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        List<Integer> l = gradingStudents(list);
        for (int i = 0; i < l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }

    public static List<Integer> gradingStudents(List<Integer> grades)
    {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++)
        {
            int b = 5 - (grades.get(i) % 5);

            if(b <= 2 && grades.get(i) >= 38)
            {

                b = b + grades.get(i);
                list.add(b);
            }
            else
            {
                list.add(grades.get(i));
            }
        }
        return list;
    }
}