package com.ttn.java.excercise;

import java.util.Scanner;

import static java.util.stream.Stream.concat;

class Overloading<str4>
{
    public static void main(String[] args)
    {
        Overloading overloading = new Overloading();
        System.out.println("Sum of two integers(int): " + overloading.add(1, 2));
        System.out.println("Sum of two integers(double): " + overloading.add(2.32, 3.25));
        System.out.println("Multiplication of two float: " + overloading.multiply(3.36f, 6.25f));
        System.out.println("Multiplication of two integers: " + overloading.multiply(9, 2));
        System.out.println("Concatenation of Two Strings: " + overloading.concat("My name is ", "Swati Panwar."));
        System.out.println("Concatenation of Three Strings: " + overloading.concat("My name is ", "Swati Panwar.", " I live in Noida"));

    }

    String concat(String first, String second, String third)
    {
        return first + second + third;
    }

    String concat(String first, String second)
    {
        return first+second;
    }


    int add (int x, int y)
    {
        return x+y;
    }
    double add (double x, double y)
    {
        return x+y;
    }
    float multiply (float x, float y)
    {
        return x*y;
    }
    int multiply (int x, int y)
    {
        return x*y;
    }

}


