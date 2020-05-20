package ProblemSolving;

import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EqualizingTheArray
{
    static int equalizeArray(int[] arr)
    {
        Set<Integer> set = new HashSet<>();

        for (int value : arr)
        {
            set.add(value);
        }

        Integer[] array = new Integer[set.size()];

        int k = 0;
        for (Integer i: set)
            array[k++] = i;

        for (int i = 0; i < array.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if(arr[j] == array[i])
                {
                    count++;
                }
            }
            array[i] = count;
        }

        Arrays.sort(array);

        return arr.length - array[array.length-1];


    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(equalizeArray(arr));
    }
}
