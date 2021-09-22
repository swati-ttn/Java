package com.ttn.java.excercise;

import java.util.Arrays;
public class Commonelement
{   
    public static void main(String[] args)
    {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {5,6,7,8,9};
        System.out.println("Array1 : "+ Arrays.toString(array1));
        System.out.println("Array2 : "+ Arrays.toString(array2));
        for (int x : array1)
        {
            for (int y : array2)
            {
                if (x == y)
                {
                    System.out.println(x);
                }
            }
        }
    }
}
